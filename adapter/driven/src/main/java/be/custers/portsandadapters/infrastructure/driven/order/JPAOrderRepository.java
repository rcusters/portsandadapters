package be.custers.portsandadapters.infrastructure.driven.order;

import be.custers.portsandadapters.domain.order.Order;
import be.custers.portsandadapters.domain.order.OrderRepository;

public class JPAOrderRepository implements OrderRepository {

    @Override
    public void save(Order order) {
        //map order to jpa entity
        //save order
    }
}
