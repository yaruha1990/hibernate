package ua.training.dao;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ua.training.entity.Movie;

public class MovieDAO implements DAO<Movie, Integer> {

    private SessionFactory factory;

    public MovieDAO(SessionFactory factory) {
        this.factory = factory;
    }

    public void create(Movie movie) {
        try(Session session = factory.openSession()){

            session.beginTransaction();

            session.save(movie);

            session.getTransaction().commit();

        }
    }

    public Movie read(Integer id) {
        try(Session session = factory.openSession()){

            Movie movie = session.get(Movie.class, id);

            return movie != null ? movie : new Movie();

        }
    }

    public void update(Movie movie) {
        try(Session session = factory.openSession()){

            session.beginTransaction();

            session.update(movie);

            session.getTransaction().commit();
        }

    }

    public void delete(Movie movie) {
        try(Session session = factory.openSession()){

            session.beginTransaction();

            session.delete(movie);

            session.getTransaction().commit();
        }
    }
}
