package com.example.demo.restcontrollers;
import com.example.demo.entities.SupplierEntity;
import com.example.demo.services.SupplierService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SupplierRestController {
    @Autowired
    private SupplierService supplierService;

    @GetMapping()
    public  List<SupplierEntity>find() {
        return supplierService.find();

    }


}


