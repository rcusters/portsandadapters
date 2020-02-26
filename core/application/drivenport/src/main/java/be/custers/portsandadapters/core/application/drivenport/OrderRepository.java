package be.custers.portsandadapters.core.application.drivenport;

import be.custers.portsandadapters.domain.order.Order;

public interface OrderRepository {

    void save(Order order);
}
