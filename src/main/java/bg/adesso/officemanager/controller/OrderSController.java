package bg.adesso.officemanager.controller;

import bg.adesso.officemanager.model.OrderS;
import bg.adesso.officemanager.service.OrderSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/orders")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class OrderSController {

    @Autowired
    private OrderSService orderService;


    @GetMapping
    public List<OrderS> getAllOrders(){

        List<OrderS> orders = new ArrayList<>();
        orderService.getAllOrders().forEach(d -> {orders.add(d);});
        return orders;

    }

    @GetMapping("{id}")
    public OrderS getOrder(@RequestParam String id){
        return orderService.getOrder(id).get();
    }

    @PostMapping
    public void addOrder(@RequestBody OrderS orderS){
        orderService.addOrder(orderS);
    }

    @DeleteMapping("{id}")
    public void deleteOrder(@RequestParam String id){
        orderService.deleteOrder(id);
    }
}
