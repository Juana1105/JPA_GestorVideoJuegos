package jpaVideojuego;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ProbandoJPA {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("gestorVideojuegos");// == persistence.xml
		EntityManager em = emFactory.createEntityManager();
		
		//hacemos una transaccion
		EntityTransaction tran = em.getTransaction();
		//hacemos que la transaccion comience
		tran.begin();
		
		//creamos objeto VIDEOJUEGO
		Videojuego j1=new Videojuego("Star Wars Jedi Survivor","Electronic Arts",2023);
		//vamos a persistir el objeto
		em.persist(j1);
		//ahora vamos a ejecutarlo con COMMIT
		tran.commit();
		
		
		
		
		
		
		
		
		
	}

	
	
	
}
