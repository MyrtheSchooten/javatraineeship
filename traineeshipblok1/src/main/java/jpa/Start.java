package jpa;

import jpa.dao.EmployeeDao;
import jpa.domain.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Start {
    static Logger log = LoggerFactory.getLogger(Start.class);

    public static void main(String[] args) {
        new Start().run();
    }

    private void run() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("MySQL").createEntityManager();
        EmployeeDao dao = new EmployeeDao(entityManager);

        Employee een = new Employee("Een",30);
        dao.save(een);

        Employee twee = new Employee("Twee",60);
        dao.save(twee);

        Employee drie = new Employee("Drie",27);
        dao.save(drie);

        Employee employee = dao.get(1);
        log(employee);

        Employee employee2 = dao.get(2);
        log(employee2);

        Employee employee3 = dao.get(3);
        log(employee3);

    }

    private void log(Object o) {
        log.info(o.toString());
    }
}
