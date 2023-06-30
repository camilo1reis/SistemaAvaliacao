package service;

import dao.QuestaoDao;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.transaction.Transactional;
import model.Questao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class QuestaoService {
    @PersistenceContext
    private EntityManager entityManager;

    private QuestaoDao questaoDAO;

    @Autowired
    public QuestaoService(QuestaoDao questaoDAO) {
        this.questaoDAO = questaoDAO;
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
