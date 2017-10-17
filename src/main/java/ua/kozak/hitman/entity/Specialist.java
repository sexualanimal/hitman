package ua.kozak.hitman.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "specialists")
@Data
public class Specialist {

    public Specialist() {
    }

    public Specialist(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @Column(name = "name", length = 20, nullable = false)
    private String name;

    @Column(name = "password", length = 20, nullable = false)
    private String password;

    @Column(name = "proofed", nullable = false)
    private boolean proofed;

//    @Column(name = "stealth", length = 3, nullable = true)
//    private int stealth;
//    @Column(name = "long_range", length = 3, nullable = true)
//    private int longRange;
//    @Column(name = "violence", length = 3, nullable = true)
//    private int violence;
//    @Column(name = "assault", length = 3, nullable = true)
//    private int assault;
//
//    @Column(name = "rating", length = 3, nullable = true)
//    private int rating;
//
//    @Column(name = "done_orders", length = 6, nullable = true)
//    private int doneOrders;
//    @Column(name = "failed_orders", length = 6, nullable = true)
//    private int failedOrders;
//
//    @OneToOne
//    @JoinColumn(name = "current_order_id", referencedColumnName = "id")
//    private Order currentOrder;

}
