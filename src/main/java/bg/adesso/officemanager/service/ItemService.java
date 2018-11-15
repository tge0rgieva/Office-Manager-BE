package bg.adesso.officemanager.service;

import bg.adesso.officemanager.model.Item;
import bg.adesso.officemanager.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Diese Klasse ist für Itemoperationsdienste wie das Auflisten von Items usw.
 *
 * @author dimov
 */
@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item getItemById(String id) {
        return itemRepository.findAll().stream().filter(i -> i.getId().equals(id)).findFirst().get();
    }

    public void addItem(Item item) {
        itemRepository.save(item);
    }

    public void deleteItemById(String id) {
        itemRepository.deleteById(id);
    }
}
