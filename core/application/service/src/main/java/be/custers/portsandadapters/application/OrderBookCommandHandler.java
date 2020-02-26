package be.custers.portsandadapters.application;

import be.custers.portsandadapters.core.application.drivenport.BookRepository;
import be.custers.portsandadapters.core.application.drivenport.OrderRepository;
import be.custers.portsandadapters.core.application.drivingport.OrderBookCommand;
import be.custers.portsandadapters.domain.order.Order;

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
