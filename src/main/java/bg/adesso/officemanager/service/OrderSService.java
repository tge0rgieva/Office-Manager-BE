package bg.adesso.officemanager.service;

import bg.adesso.officemanager.model.OrderS;
import bg.adesso.officemanager.repository.OrderSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;


@Service
public class OrderSService {

    private final OrderSRepository orderRepository;

    @Autowired
    public OrderSService(OrderSRepository orderRepository) {
        this.orderRepository = orderRepository;

    }

    public Iterable<OrderS> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<OrderS> getOrder(String id) {
        return orderRepository.findById(id);
    }

    public void addOrder(OrderS orderS) {
        orderS.setOrder_date(new Date());
        orderRepository.save(orderS);
    }

    public void deleteOrder(String id){
        orderRepository.deleteById(id);
    }
}
