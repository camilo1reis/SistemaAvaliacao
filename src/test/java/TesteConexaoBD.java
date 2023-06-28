import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TesteConexaoBD {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sistemaAvaliacaoPU");
        entityManagerFactory.close();
    }
}
