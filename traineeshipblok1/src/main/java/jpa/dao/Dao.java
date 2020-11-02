package jpa.dao;

import javax.persistence.EntityManager;

public class Dao<T> {

    protected final EntityManager entityManager;

    public Dao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(T e) {
        entityManager.getTransaction().begin();
        entityManager.persist(e);
        entityManager.getTransaction().commit();
    }

    public T get(Class<T> c, long id) {
        return entityManager.find(c, id);
    }

}
