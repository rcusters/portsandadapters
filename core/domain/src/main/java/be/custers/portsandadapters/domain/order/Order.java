package be.custers.portsandadapters.domain.order;

import be.custers.portsandadapters.domain.book.BookId;

public class Order {

    private BookId bookId;

    public Order(BookId bookId) {

        this.bookId = bookId;
    }

    public BookId getBookId() {
        return bookId;
    }
}
