package bg.adesso.officemanager.service;

import bg.adesso.officemanager.model.Item;
import bg.adesso.officemanager.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Item getItemById(Long id) {
        return itemRepository.findById(id).get();
    }

    public void addOrUpdateItem(Item item) {

        if(item.getId() != null) {

            Optional<Item> opt = itemRepository.findById(item.getId());

            if(opt.isPresent()) {
                Item updateItem = opt.get();
                updateItem.setCategory(item.getCategory());
                updateItem.setDescription(item.getDescription());
                updateItem.setName(item.getName());
                updateItem.setPictureUrl(item.getPictureUrl());
                updateItem.setIsRequested(item.getIsRequested());
            }
        }

        itemRepository.save(item);
    }

    public void deleteItemById(Long id) {
        itemRepository.deleteById(id);
    }

}
