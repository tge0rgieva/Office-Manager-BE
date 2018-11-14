package bg.adesso.officemanager.service;

import bg.adesso.officemanager.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Diese Klasse ist für Itemoperationsdienste wie das Auflisten von Items usw.
 *
 * @author dimov
 */
@Service
public class ItemService {

    List<Item> itemList = new ArrayList<>(Arrays.asList(new Item("1", "Grüner Tee", "Die Teeblätter werden im Gegensatz zu schwarzem Tee nicht fermentiert"),
            new Item("2", "Lavazza Kaffe", "Für Menschen, die den Tag mit der Energieladung beginnen möchten"),
            new Item("3", "Gelb Bananen", "Bananen")
    ));

    public List<Item> getAllitems() {
        return itemList;
    }

    public Item getItem(String id) {
        return itemList.stream().filter(i -> i.getId().equals(id)).findFirst().get();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void deleteItem(String id) {
        itemList.removeIf(i -> i.getId().equals(id));
    }
}
