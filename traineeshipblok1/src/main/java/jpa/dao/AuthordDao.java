package jpa.dao;

import jpa.domain.Author;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;


public class AuthordDao {
    private final EntityManager entityManager;

    public AuthordDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Author updateName(long id, String lastName) {
        Author e = this.get(id);
        if (e != null) {
            entityManager.getTransaction().begin();
            e.setName(lastName);
            entityManager.getTransaction().commit();
        }
        return e;
    }

    public List<Author> findBy(String lastName) {
        TypedQuery<Author> query = entityManager.createQuery("select e from Author e where e.lastName = :firstarg", Author.class);
        query.setParameter("firstarg", lastName);
        return query.getResultList();
    }

    public List<Author> findAllWithNamedQuery() {
        TypedQuery<Author> findAll = entityManager.createNamedQuery("Employee.findAll", Author.class);
        return findAll.getResultList();
    }

    public List<Author> findByPublisher(String depName) {
        TypedQuery<Author> query = entityManager.createQuery("select e from Author e JOIN e.signedBy as d where d.name LIKE :firstarg", Author.class);
        query.setParameter("firstarg", "%" + depName + "%");
        return query.getResultList();
    }

    public Author get(long id) {
        return entityManager.find(Author.class, id);
    }

    public Author update(Author e) {
        entityManager.getTransaction().begin();
        Author merged = entityManager.merge(e);
        entityManager.getTransaction().commit();
        return merged;
    }

    public void save(Author author) {
        entityManager.getTransaction().begin();
        entityManager.persist(author);
        entityManager.getTransaction().commit();
    }

    public void delete(Author author) {
        entityManager.getTransaction().begin();
        entityManager.remove(author);
        entityManager.getTransaction().commit();
    }

}
