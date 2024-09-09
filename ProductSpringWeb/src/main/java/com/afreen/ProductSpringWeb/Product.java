package com.afreen.ProductSpringWeb;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



//@Data can be used instead of creating the getters and setters
//Line 49 to 68 can be replaced by @Data

@Entity
//entity is used to tell that this is a table

//table is used to tell the name of the table
@Table(name = "products")
public class Product {

    @Id
    //id is used to tell that this is the primary key
    //generated value is used to tell that this is auto generated
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private String type;

    //column is used to tell the name of the column
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
