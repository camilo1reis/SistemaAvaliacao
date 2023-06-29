package service;

import dao.QuestaoDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import model.Questao;

import java.util.List;

@Transactional
public class QuestaoService {
    @PersistenceContext
    private EntityManager entityManager;

    private QuestaoDao questaoDAO;


    public QuestaoService() {
        // Inicialize o QuestaoDAO com o EntityManager
        this.questaoDAO = new QuestaoDao();
    }

    public Questao findById(int id) {
        return entityManager.find(Questao.class, id);
    }

    public List<Questao> findAll() {
        return entityManager.createQuery("SELECT q FROM Questao q", Questao.class).getResultList();
    }

    public void save(Questao questao) {
        entityManager.persist(questao);
    }

    public void update(Questao questao) {
        entityManager.merge(questao);
    }

    public void delete(Questao questao) {
        entityManager.remove(questao);
    }

}
