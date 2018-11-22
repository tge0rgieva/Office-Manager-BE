package bg.adesso.officemanager.repository;

import bg.adesso.officemanager.model.OrderS;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderSRepository extends CrudRepository<OrderS, Long> {


}
