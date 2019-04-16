package com.codegym.bl.model;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "merchandises")
public class Merchandise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String price;
    private String description;
    @OneToMany(targetEntity = Merchandise.class)
    private List<Merchandise> merchandises;
    public Merchandise() {
    }
    public Merchandise(Long id,String name,String price,String description) {
        this.id=id;
        this.name=name;
        this.price=price;
        this.description=description;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public List<Merchandise> getMerchandises() {
        return merchandises;
    }

    public void setMerchandises(List<Merchandise> merchandises) {
        this.merchandises = merchandises;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
