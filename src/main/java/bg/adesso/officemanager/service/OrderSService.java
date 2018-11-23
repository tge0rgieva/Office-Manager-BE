package bg.adesso.officemanager.service;

import bg.adesso.officemanager.model.OrderS;
import bg.adesso.officemanager.repository.ItemRepository;
import bg.adesso.officemanager.repository.OrderSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class OrderSService {

    private final OrderSRepository orderRepository;
    private final ItemRepository itemRepository;

    @Autowired
    public OrderSService(OrderSRepository orderRepository,ItemRepository itemRepository) {
        this.orderRepository = orderRepository;
        this.itemRepository = itemRepository;
    }

    public Iterable<OrderS> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<OrderS> getOrder(Long id) {
        return orderRepository.findById(id);
    }

    public void addOrder(OrderS orderS) {
        orderS.setOrder_date(new Date());
        orderS.setItem(itemRepository.findById(orderS.getItem().getId()).get());
        orderRepository.save(orderS);
    }

    public void deleteOrder(Long id){
        orderRepository.deleteById(id);
    }

    public void updateOrderStatus (List<OrderS> orders){
        for (OrderS o: orders) {
            OrderS order = orderRepository.findById(o.getId()).get();
            order.setIsComplete(true);
            orderRepository.save(order);
        }
    }
}
