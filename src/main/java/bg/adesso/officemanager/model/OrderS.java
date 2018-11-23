package bg.adesso.officemanager.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class OrderS {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
 
    private Long order_giver_id;
  
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_id")
    private Item item;
  
    private Date order_date;
    private boolean isComplete = false;

    public OrderS() {
    }

    public OrderS(Long id, Long order_giver_id, Item item, Date order_date) {
        this.id = id;
        this.order_giver_id = order_giver_id;
        this.item = item;
        this.order_date = order_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrder_giver_id() {
        return order_giver_id;
    }

    public void setOrder_giver_id(Long order_giver_id) {
        this.order_giver_id = order_giver_id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    public boolean getIsComplete() {
        return this.isComplete;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }
}
