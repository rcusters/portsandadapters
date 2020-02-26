package be.custers.portsandadapters.infrastructure.driving.order;

import be.custers.portsandadapters.application.CommandBus;
import be.custers.portsandadapters.application.OrderBookCommand;
import be.custers.portsandadapters.domain.book.BookId;

public class OrderBookController {

    private CommandBus commandBus;

    public OrderBookController(CommandBus commandBus) {
        this.commandBus = commandBus;
    }

    public void orderBook(BookId bookId) {
        commandBus.execute(new OrderBookCommand(bookId));
    }
}
