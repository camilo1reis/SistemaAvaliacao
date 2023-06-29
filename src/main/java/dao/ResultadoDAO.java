package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import model.Resultado;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ResultadoDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public Resultado obterPorId(long id) {
        return entityManager.find(Resultado.class, id);
    }

    public List<Resultado> obterTodos() {
        TypedQuery<Resultado> query = entityManager.createQuery("SELECT r FROM Resultado r", Resultado.class);
        return query.getResultList();
    }

    @Transactional
    public void salvar(Resultado resultado) {
        entityManager.persist(resultado);
    }

    @Transactional
    public void atualizar(Resultado resultado) {
        entityManager.merge(resultado);
    }

    @Transactional
    public void excluir(Resultado resultado) {
        entityManager.remove(resultado);
    }

    // Outros métodos relevantes para o DAO...

}

