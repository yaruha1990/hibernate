package ua.training;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.training.dao.AuthorDAO;
import ua.training.dao.DAO;
import ua.training.entity.Author;

public class Application {

    public static void main(String[] args) {
        SessionFactory factory = null;

        try {
            factory = new Configuration().configure().buildSessionFactory();
            DAO<Author, Integer> authorDAO = new AuthorDAO(factory);

            Author author = authorDAO.read(3);
            System.out.println(author);

        }finally {
            if (factory != null){
                factory.close();
            }
        }
    }

}
