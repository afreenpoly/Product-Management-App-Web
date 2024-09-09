package com.afreen.ProductSpringWeb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService{
    
    @Autowired
    ProductDB db;

    
    public List<Product> getAllProducts() {
        // return prodlist;
        return db.findAll();
    }

    public Product getProductById(int id) {
        // return prodlist.get(0);
        return db.findById(id).get();
    }

    public Product getProductByName(String name) {
        //convert name to first letter capital and rest small
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        return db.findByName(name); 

        //by default some methods are there in jparepository like findbyid,findall
        //we can also create our own methods like findbyname
    }

    //method to add product
    public void addProduct(Product p) {
        // prodlist.add(p);
        db.save(p);
    }

}