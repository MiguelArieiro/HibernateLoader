package jpa;

import java.text.ParseException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Actor;
import model.Movie;



public class JPAWriteInfo {

	public static void main(String[] args) {

	
		List<Actor> actors = GetInfo.getActors();
		List<Movie> movies = null;
		
		
			try {
				movies = GetInfo.getMovies();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		List<Actor> actorsWithMovies = GetInfo.relateActorWithMovie(actors, movies);
                
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
	
		tx.begin();
		
		for (Actor actor : actors)
			em.persist(actor);
		for (Actor actor : actors)
			System.out.println(actor);
		
		for (Movie movie : movies)
			em.persist(movie);
		
		for (Movie movie : movies)
			System.out.println(movie);
		
		tx.commit();
		
//		tx.begin();
//			for (Actor a : actorsWithMovies)
//				em.persist(a);
//			
//			for (Actor a : actorsWithMovies)
//				System.out.println(a);
//		tx.commit();
		em.close();
		emf.close();
		
		
		
	}

}
