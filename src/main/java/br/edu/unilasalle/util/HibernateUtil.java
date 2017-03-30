package br.edu.unilasalle.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
	private static EntityManagerFactory factory;
	
	static {
		factory = Persistence.createEntityManagerFactory("FinancTool");
	}
	public static EntityManager getEntityManager(){
		return factory.createEntityManager();
	}
}
