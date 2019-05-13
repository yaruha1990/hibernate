package ua.training.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ua.training.entity.Author;
import ua.training.entity.Movie;

public class AuthorDAO implements DAO<Author,Integer> {

    private SessionFactory factory;

    public AuthorDAO(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(Author author) {
        try(Session session = factory.openSession()){

            session.beginTransaction();

            session.save(author);

            session.getTransaction().commit();

        }

    }

    @Override
    public Author read(Integer id) {
        try (final Session session = factory.openSession()) {
            return session.get(Author.class, id);
        }
    }

    @Override
    public void update(Author author) {

    }

    @Override
    public void delete(Author author) {

    }
}
