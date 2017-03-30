package br.edu.unilasalle.gerenciadorfinanceiro.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.edu.unilasalle.gerenciadorfinanceiro.model.Categoria;
import br.edu.unilasalle.util.HibernateUtil;

import javax.persistence.EntityManager;

public class CategoriaDAO {
    public void insert(Categoria categoria){
        EntityManager em = HibernateUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(categoria);
        em.getTransaction().commit();
        em.close();
    }

    public void delete(Categoria categoria){
        EntityManager em = HibernateUtil.getEntityManager();
        em.getTransaction().begin();
        em.remove(categoria);
        em.getTransaction().commit();
        em.close();
    }

    public void update(Categoria categoria){
        EntityManager em = HibernateUtil.getEntityManager();
        em.getTransaction().begin();
        em.merge(categoria);
        em.getTransaction().commit();
        em.close();

    }

    public Categoria selectById(Integer id){
        Categoria categoria;
        EntityManager em = HibernateUtil.getEntityManager();
        em.getTransaction().begin();
        categoria = em.getReference(Categoria.class, id);
        em.getTransaction().commit();
        em.close();
        return categoria;
    }

    public List<Categoria> selectAll(){
        List<Categoria> categorias = null;
        EntityManager em = HibernateUtil.getEntityManager();
        em.getTransaction().begin();
        categorias = em.createQuery("from Categoria").getResultList();
        em.getTransaction().commit();
        em.close();
        return categorias;
    }

}