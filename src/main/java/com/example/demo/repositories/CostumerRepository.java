package com.example.demo.repositories;

import com.example.demo.entities.CostumerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CostumerRepository extends JpaRepository<CostumerEntity, Integer> {
}
