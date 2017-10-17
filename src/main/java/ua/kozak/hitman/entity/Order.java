package ua.kozak.hitman.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Data
public class Order {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;

//    @Column(name = "filter_stealth", length = 3, nullable = false)
//    private int filter_stealth;
//    @Column(name = "filter_long_range", length = 3, nullable = false)
//    private int filter_longRange;
//    @Column(name = "filter_violence", length = 3, nullable = false)
//    private int filter_violence;
//    @Column(name = "filter_assault", length = 3, nullable = false)
//    private int filter_assault;
//    @Column(name = "filter_rating", length = 3, nullable = false)
//    private int filter_rating;
//    @Column(name = "filter_done_orders", length = 6, nullable = false)
//    private int filter_doneOrders;
//    @Column(name = "filter_failed_orders", length = 6, nullable = false)
//    private int filter_failedOrders;
//
//    @ManyToOne
//    @JoinColumn(name = "client_id", referencedColumnName = "id")
//    private Client client;
//
//    @OneToOne
//    @JoinColumn(name = "target_id", referencedColumnName = "id")
//    private Target target;
//
//    @Column(name = "price", length = 9, nullable = false)
//    private double price;
}
