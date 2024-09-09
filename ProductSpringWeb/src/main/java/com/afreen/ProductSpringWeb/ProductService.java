package com.afreen.ProductSpringWeb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService{
    
    @Autowired
    ProductDB db;

    // //method to add products,which adds product to array
    // public void addProduct(Product p) {
    //     // prodlist.add(p);
    //     db.save(p);
    // }


    public List<Product> getAllProducts() {
        // return prodlist;
        return db.findAll();
    }

    public Product getProductById(int id) {
        // return prodlist.get(0);
        return db.findById(id).get();
    }


}