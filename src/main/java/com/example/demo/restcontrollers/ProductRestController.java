package com.example.demo.restcontrollers;
import com.example.demo.entities.ProductEntity;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductRestController {
    @Autowired
    private ProductService productService;

    @GetMapping()
    public  List<ProductEntity>find() {
        return productService.find();

    }


}
