package be.custers.portsandadapters.domain.order;

import be.custers.portsandadapters.domain.book.BookId;

public class OrderCreatedEvent {

    private OrderId orderId;
    private BookId bookId;

    public OrderCreatedEvent(OrderId orderId, BookId bookId) {
        this.orderId = orderId;
        this.bookId = bookId;
    }

    public OrderId getOrderId() {
        return orderId;
    }

    public BookId getBookId() {
        return bookId;
    }
}
