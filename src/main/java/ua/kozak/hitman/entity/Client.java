package ua.kozak.hitman.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "clients")
@Data
public class Client {

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

//    @OneToMany
//    @JoinColumn(name = "orders", referencedColumnName = "id")
//    private List<Order> orders;

}
