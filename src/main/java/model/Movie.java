package model;

import static javax.persistence.AccessType.FIELD;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Movie implements Serializable {

    @Id
    private String movie_title;
    private String director;
    private Integer releaseDate;
    @ManyToMany
    private List<Actor> actors;

    public Movie() {
        super();
    }

    public Movie(String movie_title, String director, Integer releaseDate) {
        super();
        this.movie_title = movie_title;
        this.director = director;
        this.releaseDate = releaseDate;
    }

    public String getMovie_title() {
        return movie_title;
    }

    public String getDirector() {
        return director;
    }


    public Integer getReleaseDate() {
        return releaseDate;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setMovie_title(String movie_title) {
        this.movie_title = movie_title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public void addActor(Actor a) {
        if (actors == null) {
            actors = new ArrayList<Actor>();
        }
        actors.add(a);
    }
}
