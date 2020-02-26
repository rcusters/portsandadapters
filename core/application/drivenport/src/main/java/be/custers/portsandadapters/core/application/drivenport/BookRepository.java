package be.custers.portsandadapters.core.application.drivenport;

import be.custers.portsandadapters.domain.book.Book;
import be.custers.portsandadapters.domain.book.BookId;

import java.util.Optional;

public interface BookRepository {

    void save(Book book);

    Optional<Book> findBy(BookId bookId);
}
