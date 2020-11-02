package jpa.dao;

import javax.persistence.EntityManager;

public class BookDao {

    protected final EntityManager entityManager;

    public BookDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
