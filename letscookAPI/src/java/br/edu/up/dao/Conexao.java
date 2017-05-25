package br.edu.up.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	
	static EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("letscookAPIPU");

	public static EntityManagerFactory getInstance() {
		return emf;
	}
	
}
