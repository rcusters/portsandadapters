package be.custers.portsandadapters.application;

import be.custers.portsandadapters.domain.book.BookId;
import be.custers.portsandadapters.domain.port.Command;

public class OrderBookCommand implements Command {

    private BookId bookId;

    public OrderBookCommand(BookId bookId) {
        this.bookId = bookId;
    }

    public BookId getBookId() {
        return bookId;
    }
}
