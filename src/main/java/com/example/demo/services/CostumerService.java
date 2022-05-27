package com.example.demo.services;

import com.example.demo.entities.CostumerEntity;
import com.example.demo.repositories.CostumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostumerService {

    @Autowired
    private CostumerRepository costumerRepository;

    public List<CostumerEntity> find(){
        return costumerRepository.findAll();
    }

}

