package jpa;

import jpa.dao.AuthordDao;
import jpa.dao.BookDao;
import jpa.dao.Dao;
import jpa.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class Start {
    static Logger log = LoggerFactory.getLogger(Start.class);

    public static void main(String[] args) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("MySQL").createEntityManager();
        AuthordDao dao = new AuthordDao(entityManager);

        new Start().run(dao, entityManager);
        new Start().logAll(dao);

    }

    private void run(AuthordDao dao, EntityManager entityManager) {
        ////////////////////////////////////////// --> maken en saven authors
        Author een = new Author("Bakker");
        dao.save(een);
        Author twee = new Author("Smit");
        dao.save(twee);
        Author drie = new Author("Meijer");
        dao.save(drie);
        Author vier = new Author("Mulder");
        dao.save(vier);
        Author vijf = new Author("de Boer");
        dao.save(vijf);
        Author zes = new Author("Pieters");
        dao.save(zes);

        /////////////////////////////////////////// --> delete author 2
        dao.delete(twee);

        /////////////////////////////////////////// --> update naam author 1
        dao.updateName(1, "Hendriks");
        dao.save(een);

        ////////////////////////////////////////// --> try setters
        drie.setHasDebuted(Boolean.TRUE);
        vijf.setHasDebuted(Boolean.TRUE);
        zes.setHasDebuted(Boolean.TRUE);
        dao.update(drie);
        dao.update(vijf);
        dao.update(zes);

        /////////////////////////////////////////// --> find by lastname
        log(dao.findBy("Meijer"));

        /////////////////////////////////////////// --> enum
        een.setGenre(Genre.FICTION);
        dao.save(een);

        drie.setGenre(Genre.CHILDREN);
        dao.save(drie);

        vier.setGenre(Genre.BIOGRAPHY);
        dao.save(vier);

        vijf.setGenre(Genre.ROMANCE);
        dao.save(vijf);

        zes.setGenre(Genre.FICTION);
        dao.save(zes);

        ///////////////////////////////////////////////// --> unidirectional
        Publisher theBestPublisher = new Publisher("the Best Publisher");
        Publisher eenAnderePublisher = new Publisher("een Andere Publisher");
        Publisher deLaaststePublisher = new Publisher("de Laatste Publisher");

        Dao<Publisher> publisherDao = new Dao<>(entityManager);
        publisherDao.save(theBestPublisher);
        publisherDao.save(eenAnderePublisher);
        publisherDao.save(deLaaststePublisher);

        een.setSignedBy(theBestPublisher);
        drie.setSignedBy(deLaaststePublisher);
        vier.setSignedBy(eenAnderePublisher);
        vijf.setSignedBy(theBestPublisher);
        zes.setSignedBy(deLaaststePublisher);

        dao.update(een);
        dao.update(drie);
        dao.update(vier);
        dao.update(vijf);
        dao.update(zes);

        List<Author> soft = dao.findByPublisher("best");
        soft.forEach(this::log);

        ////////////////////////////////////////////////// --> bidirectional
        Dao assistantDao = new Dao(entityManager);

        Assistant assistant1 = new Assistant("Assistent 1");
        Assistant assistant2 = new Assistant("Assistent 2");
        Assistant assistant3 = new Assistant("Assistent 3");
        assistantDao.save(assistant1);
        assistantDao.save(assistant2);
        assistantDao.save(assistant3);

        een.setAssistant(assistant3);
        drie.setAssistant(assistant2);
        vier.setAssistant(assistant2);
        vijf.setAssistant(assistant1);
        zes.setAssistant(assistant1);

        dao.update(een);
        dao.update(drie);
        dao.update(vier);
        dao.update(vijf);
        dao.update(zes);

        ////////////////////////////////////////////////// --> test one-to-many (Book testen)

    }

    private void logAll(AuthordDao dao) {
        List<Author> allAuthors = dao.findAllWithNamedQuery();
        log(allAuthors);
    }

    private void log(Object o) {
        log.info(o.toString());
    }
}
