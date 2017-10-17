package ua.kozak.hitman.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "targets")
@Data
public class Target {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;

    @Column(name = "name", length = 3, nullable = false)
    private String name;

    @Column(name = "location", length = 100, nullable = false)
    private String location;

    @Column(name = "comment", length = 100, nullable = false)
    private String comment;
}
