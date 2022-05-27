package com.example.demo.repositories;

import com.example.demo.entities.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SupplierRepository extends JpaRepository <SupplierEntity,Integer> {
}
