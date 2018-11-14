package bg.adesso.officemanager.controller;

import bg.adesso.officemanager.model.Item;
import bg.adesso.officemanager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ItemController dient zur Bearbeitung von Anfragen.
 *
 * @author dimov
 */
@RequestMapping("/items")
@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }

    @GetMapping("{id}")
    public Item getItem(@RequestParam String id){
        return itemService.getItemById(id);
    }

    @PostMapping
    public void addItem(@RequestBody Item item){
        itemService.addItem(item);
    }

    @DeleteMapping("{id}")
    public void deleteItem(@RequestParam String id){
        itemService.deleteItemById(id);
    }
}
