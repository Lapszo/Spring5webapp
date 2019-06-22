package lapszo.firstspringapp.spring5app.repositories;

import lapszo.firstspringapp.spring5app.model.Author;
import org.springframework.data.repository.CrudRepository;



public interface AuthorRepository extends CrudRepository<Author, Long> {
}
