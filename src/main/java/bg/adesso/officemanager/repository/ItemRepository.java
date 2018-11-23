package bg.adesso.officemanager.repository;

import bg.adesso.officemanager.model.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends CrudRepository<Item, Long> {
    @Override
    List<Item> findAll();

    @Override
    Item save(Item item);

    @Override
    Optional<Item> findById(String id);

    @Override
    void deleteById(String id);
}
