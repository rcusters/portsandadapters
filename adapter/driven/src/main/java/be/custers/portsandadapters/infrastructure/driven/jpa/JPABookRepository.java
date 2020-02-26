package be.custers.portsandadapters.infrastructure.driven.jpa;

import be.custers.portsandadapters.core.application.drivenport.BookRepository;
import be.custers.portsandadapters.domain.book.Book;
import be.custers.portsandadapters.domain.book.BookId;

import java.util.Optional;

public class JPABookRepository implements BookRepository {

    @Override
    public void save(Book book) {
        //map to a JPA entity
        //save book
    }

    @Override
    public Optional<Book> findBy(BookId bookId) {
        return Optional.empty();
    }
}
