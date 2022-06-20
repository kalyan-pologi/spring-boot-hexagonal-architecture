package eteosf.hexagonal.persistence.jpa.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
@Data
public class ProductEntity {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @Column
    private String name;

    @Column
    private String description;


}
