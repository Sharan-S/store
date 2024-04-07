package com.broken.store.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class Product {

    @GetMapping("/{id}")
    private String getProduct(@PathVariable int id){
        return "Show product for id: " + id;
    }
}
