package net.sathyan.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeneralConfig {
	
	public  EntityManager getEntityManager() {
		
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("SpringJPA");
	     return factory.createEntityManager();
	} 

}
