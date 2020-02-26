package be.custers.portsandadapters.application;

import be.custers.portsandadapters.domain.book.BookRepository;
import be.custers.portsandadapters.domain.order.Order;
import be.custers.portsandadapters.domain.order.OrderRepository;

public class OrderBookCommandHandler implements CommandHandler<OrderBookCommand> {

    private OrderRepository orderRepository;
    private BookRepository bookRepository;

    public OrderBookCommandHandler(OrderRepository orderRepository, BookRepository bookRepository) {
        this.orderRepository = orderRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void execute(OrderBookCommand command) {
        if(bookRepository.findBy(command.getBookId()).isEmpty()){
            throw new IllegalArgumentException("Cannot order a book that does not exist");
        }
        orderRepository.save(new Order(command.getBookId()));
    }
}
