package com.codegym.casestudy.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    private double price;

    private double saleoff;

    @ManyToOne
    private Category category;

    private String color;

    private String description;

    private String imgUrl;





}
