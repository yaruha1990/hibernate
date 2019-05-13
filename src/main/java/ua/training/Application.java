package ua.training;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.training.dao.DAO;
import ua.training.dao.MovieDAO;
import ua.training.entity.Movie;

public class Application {

    public static void main(String[] args) {
        SessionFactory factory = null;

        try {
            factory = new Configuration().configure().buildSessionFactory();
            DAO<Movie, String> movieDAO = new MovieDAO(factory);
            Movie movie = new Movie("Silicon Valley","About programmers",5);
            movieDAO.create(movie);

        }finally {
            if (factory != null){
                factory.close();
            }
        }
    }

}
