package lapszo.firstspringapp.spring5app.DevBootstrap;

import lapszo.firstspringapp.spring5app.model.Author;
import lapszo.firstspringapp.spring5app.model.Book;
import lapszo.firstspringapp.spring5app.repositories.AuthorRepository;
import lapszo.firstspringapp.spring5app.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){
        //Eric
        Author eric = new Author("Eric", "Evans");
        Book d = new Book("Domain Driven Design", "1234", "Harper collins");
        eric.getBooks().add(d);
        d.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(d);

        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book no = new Book("J2ee Development without EJB", "234435", "Worx");

        authorRepository.save(rod);
        bookRepository.save(no);
    }



}
