package be.custers.portsandadapters.infrastructure.driven.jpa;

import be.custers.portsandadapters.core.application.drivenport.OrderRepository;
import be.custers.portsandadapters.domain.order.Order;

public class JPAOrderRepository implements OrderRepository {

    @Override
    public void save(Order order) {
        //map order to jpa entity
        //save order
    }
}
