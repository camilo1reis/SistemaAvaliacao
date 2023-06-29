package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import model.Questao;

import java.util.List;

public class QuestaoDao {
    private EntityManager entityManager;

    public QuestaoDao() {
        this.entityManager = entityManager;
    }

    public Questao findById(int id) {
        return entityManager.find(Questao.class, id);
    }

    public List<Questao> findAll() {
        TypedQuery<Questao> query = entityManager.createQuery("SELECT q FROM Questao q", Questao.class);
        return query.getResultList();
    }

    public void save(Questao questao) {
        entityManager.getTransaction().begin();
        entityManager.persist(questao);
        entityManager.getTransaction().commit();
    }

    public void update(Questao questao) {
        entityManager.getTransaction().begin();
        entityManager.merge(questao);
        entityManager.getTransaction().commit();
    }

    public void delete(Questao questao) {
        entityManager.getTransaction().begin();
        entityManager.remove(questao);
        entityManager.getTransaction().commit();
    }
}