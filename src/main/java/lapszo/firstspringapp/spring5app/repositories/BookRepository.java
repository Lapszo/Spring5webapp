package lapszo.firstspringapp.spring5app.repositories;

import lapszo.firstspringapp.spring5app.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
