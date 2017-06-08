package br.edu.up.letscook.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexaoSingleton {
	
	static EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("letscookAPIPU");

	public static EntityManager getInstance() {
		return emf.createEntityManager();
	}
	
}
