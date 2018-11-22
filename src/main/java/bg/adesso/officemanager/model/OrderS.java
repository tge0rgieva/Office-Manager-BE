package bg.adesso.officemanager.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class OrderS {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String order_giver_id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_id")
    private Item item;
    private Date order_date;
    private Boolean isComplete = false;

    public OrderS() {
    }

    public OrderS(Long id, Long order_giver_id, Long item_id, Date order_date) {
        this.id = id;
        this.order_giver_id = order_giver_id;
        this.item_id = item_id;
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

    public Long getItem_id() {
        return item_id;
    }

    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }
}
