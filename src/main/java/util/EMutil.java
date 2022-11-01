package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMutil {
	
	private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("library");
	
	public static EntityManager getEM() {
		return emf.createEntityManager();
	}

}
