package be.custers.portsandadapters.domain.book;

import java.util.Optional;

public interface BookRepository {

    void save(Book book);

    Optional<Book> findBy(BookId bookId);
}
