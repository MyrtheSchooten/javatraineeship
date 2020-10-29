package jpa.dao;

import jpa.domain.Employee;

import javax.persistence.EntityManager;

public class EmployeeDao {
    private final EntityManager entityManager;

    public EmployeeDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Employee employee) {
        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();
    }

    public Employee get(long id) {
        return entityManager.find(Employee.class, id);
    }
}
