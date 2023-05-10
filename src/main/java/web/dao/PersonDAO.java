package web.dao;

import web.models.Person;
import java.util.List;

public interface PersonDAO {

    public List<Person> index();
    public void save(Person person);
    public Person show(int id);
    public Person update(Person updatedPerson);
    public void delete(int id);
}
