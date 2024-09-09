package com.afreen.ProductSpringWeb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    //this is for /products
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    //get one single product by id
    //commenting for copilot
    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable int id) {
        return service.getProductById(id);
    }

    //get one single product by name
    //path variable is used to get the value from the url
    @GetMapping("/product/name/{name}")
    public Product getProduct(@PathVariable String name) {
        return service.getProductByName(name);
    }

    // //this is for /addproduct
    //requestbody is used to get the data from the body of the request
    //responseentity is used to send the response back to the client
    @PostMapping("/addproduct")
    public ResponseEntity<String> addProduct(@RequestBody Product p) {
    service.addProduct(p);
    return new ResponseEntity<>("Product added successfully", HttpStatus.CREATED);

    //use postman to test the post request
}

}
