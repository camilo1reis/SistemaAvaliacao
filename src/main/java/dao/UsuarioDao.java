package dao;

import model.Usuario;
import org.springframework.orm.jpa.EntityManagerFactoryUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class UsuarioDao {
    public Usuario salvar(Usuario usuario) {
        EntityManager em = EntityManagerFactoryUtils.getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(usuario);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
        return usuario;
    }

    public Usuario atualizar(Usuario usuario) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.merge(usuario);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
        return usuario;
    }

    public void excluir(Usuario usuario) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.remove(em.merge(usuario));
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public Usuario buscarPorId(int id) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        Usuario usuario = null;
        try {
            usuario = em.find(Usuario.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return usuario;
    }

    public List<Usuario> buscarTodos() {
        EntityManager em = EntityManagerUtil.getEntityManager();
        List<Usuario> usuarios = null;
        try {
            TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u", Usuario.class);
            usuarios = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return usuarios;
    }
}
