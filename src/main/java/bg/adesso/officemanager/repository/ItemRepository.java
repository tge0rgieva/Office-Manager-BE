package bg.adesso.officemanager.repository;

import bg.adesso.officemanager.model.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item, String> {
    @Override
    List<Item> findAll();

    @Override
    Item save(Item item);

    @Override
    void deleteById(String id);
}
