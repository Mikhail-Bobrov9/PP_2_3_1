package web.dao;


import org.springframework.stereotype.Component;
import web.models.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class PersonDAOImp implements PersonDAO {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public  List<Person> index() {
        return em.createQuery("from Person", Person.class).getResultList();
    }

    @Transactional
    public void save(Person person) {
        em.persist(person);
        em.flush();
    }

    @Transactional
    public Person show(int id) {
        return em.find(Person.class, id);
    }

    @Transactional
    public Person update(Person updatedPerson) {
        return em.merge(updatedPerson);
    }

    @Transactional
    public void delete(int id) {
        em.remove(show(id));
        em.flush();
    }
}
