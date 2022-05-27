package com.example.demo.services;
import com.example.demo.entities.SupplierEntity;
import com.example.demo.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;

    public List <SupplierEntity> find(){
        return supplierRepository.findAll();
    }



}
