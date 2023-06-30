

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteConexaoBD {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sistemaAvaliacaoPU");
        entityManagerFactory.close();
    }
}
