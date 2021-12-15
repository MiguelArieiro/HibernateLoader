package model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Actor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String actor_name;
    private Integer age;
    private Double imdbScore;
    @ManyToMany(mappedBy = "actors")
    private List<Movie> movies;

    public Actor() {
        super();
    }

    public Actor(String actor_name, Integer age, Double imdbScore) {
        super();
        this.actor_name = actor_name;
        this.age = age;
        this.imdbScore = imdbScore;
    }

    public String getName() {
        return actor_name;
    }

    public Integer getMovies() {
        if (movies == null) {
            return 0;
        }
        return movies.size();
    }

    public Integer getAge() {
        return age;
    }

    public Double getScore() {
        return imdbScore;
    }

    public void addMovie(Movie m) {
        if (movies == null) {
            movies = new ArrayList<Movie>();
        }
        movies.add(m);
        m.addActor(this);
    }

    public void setActor_name(String actor_name) {
        this.actor_name = actor_name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setImdbScore(Double imdbScore) {
        this.imdbScore = imdbScore;
    }


    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

}
