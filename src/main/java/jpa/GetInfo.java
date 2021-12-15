package jpa;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import model.*;


public class GetInfo {

	private static List<Actor> actorsList;
	private static List<Movie> moviesList;

	
	public static List<Actor> getActors() {
		actorsList = new ArrayList<Actor>();
		
		Actor actor;
                
                actor = new Actor("Johnny Sins", 30, 6.9);
                actorsList.add(actor);
                actor = new Actor("Jackie Chan", 69, 10.0);
                actorsList.add(actor);
                actor = new Actor("Skrillex", 29, 3.5);
                actorsList.add(actor);
                actor = new Actor("Logan Paul", 25, 1.0);
                actorsList.add(actor);
                actor = new Actor("Jake Paul", 22, 0.9);
                actorsList.add(actor);
                actor = new Actor("Leandro DiCaprio", 50, 7.6);
                actorsList.add(actor);
                actor = new Actor("Marcelo Sousa", 85, 5.2);
                actorsList.add(actor);
                actor = new Actor("Miguel Arieiro", 25, 10.4);
                actorsList.add(actor);
                actor = new Actor("Ivan Kuzmin", 26, 3.7);
                actorsList.add(actor);
                actor = new Actor("Britney Spears", 45, 5.0);
                actorsList.add(actor);
                actor = new Actor("Madonna", 65, 7.0);
                actorsList.add(actor);
                actor = new Actor("Quim barreiros", 20, 10.0);
                actorsList.add(actor);
                actor = new Actor("Luciana Abreu", 35, 8.0);
                actorsList.add(actor);
                actor = new Actor("Quim das remisturas", 35, 7.2);
                actorsList.add(actor);
                actor = new Actor("Mario Donatelli", 30, 7.0);
                actorsList.add(actor);
                actor = new Actor("Fabio Coentrao", 17, 6.0);
                actorsList.add(actor);
                actor = new Actor("Fabiana Sousa", 22, 5.4);
                actorsList.add(actor);
                actor = new Actor("Luisa Maria", 27, 8.2);
                actorsList.add(actor);
                actor = new Actor("Pedro Sousa", 36, 8.9);
                actorsList.add(actor);
                actor = new Actor("Bobi", 3, 10.0);
                actorsList.add(actor);

                return actorsList;
        }

	
	public static List<Movie> getMovies() throws ParseException {
		moviesList = new ArrayList<Movie>();
		
		
		Movie movie;
		movie = new Movie("The Shawshank Redemption", "Frank Darabont", 1994);
                moviesList.add(movie);
                movie = new Movie("The Godfather", "Francis Ford Coppola", 1972);
                moviesList.add(movie);
                movie = new Movie("The Godfather: Part II", "Francis Ford Coppola", 1974);
                moviesList.add(movie);
                movie = new Movie("The Dark Knight", "Christopher Nolan", 2008);
                moviesList.add(movie);
                movie = new Movie("12 Angry Men", "Sidney Lumet", 1957);
                moviesList.add(movie);
                movie = new Movie("Schindler's List", "Steven Spielberg", 1993);
                moviesList.add(movie);
                movie = new Movie("The Lord of the Rings: The Return of the King", "Peter Jackson", 2003);
                moviesList.add(movie);
                movie = new Movie("Pulp Fiction", "Quentin Tarantino", 1994);
                moviesList.add(movie);
                movie = new Movie("The Good, the Bad and the Ugly", "Sergio Leone", 1994);
                moviesList.add(movie);
                
		return moviesList;
	}
	
	
	public static List<Actor> relateActorWithMovie(List<Actor> actors, List<Movie> movies){
		List <Movie> temp_movies = new ArrayList<Movie>();
		int size = actors.size();
		for (int i = movies.size()-1; i>=0; i--) {
			actors.get(i%size).addMovie(movies.get(i));
		}
		return actors;
	}

}
