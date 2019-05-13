package ua.training;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.training.dao.DAO;
import ua.training.dao.MovieDAO;
import ua.training.entity.Author;
import ua.training.entity.Movie;

public class Application {

    public static void main(String[] args) {
        SessionFactory factory = null;

        try {
            factory = new Configuration().configure().buildSessionFactory();
            DAO<Movie, Integer> movieDAO = new MovieDAO(factory);
            
            Movie movie1 = movieDAO.read(2);
            System.out.println(movie1);

        }finally {
            if (factory != null){
                factory.close();
            }
        }
    }

}
