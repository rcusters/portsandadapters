package be.custers.portsandadapters.core.application.drivingport;

import be.custers.portsandadapters.domain.book.BookId;

public class OrderBookCommand implements Command {

    private BookId bookId;

    public OrderBookCommand(BookId bookId) {
        this.bookId = bookId;
    }

    public BookId getBookId() {
        return bookId;
    }
}
