package com.afreen.ProductSpringWeb;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private String type;

    @Column(name = "color")
    private String colour;
    
    private int price;


    public Product(String name, String type, String colour, int price) {
        this.name = name;
        this.type = type;
        this.colour = colour;
        this.price = price;
    }


    public Product() {
        //TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getType() {
        return type;
    }


    public String getColour() {
        return colour;
    }


    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Products{name=" + name + ", type=" + type + ", colour=" + colour + ", price=" + price + "}";
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setType(String type) {
        this.type = type;
    }


    public void setColour(String colour) {
        this.colour = colour;
    }


    public void setPrice(int price) {
        this.price = price;
    }
}
