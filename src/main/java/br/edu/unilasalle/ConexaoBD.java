package br.edu.unilasalle;

import org.hibernate.Session;

import br.edu.unilasalle.util.HibernateUtil;

import javax.persistence.EntityManager;

public class ConexaoBD {
	public static void main(String [] args){
		EntityManager sessao = null;
		try{
			sessao = HibernateUtil.getEntityManager();
			System.out.println("Conectado!!!");
		}
		finally{
			sessao.close();
		}
	}
	
}
