
package com.example.demo.restcontrollers;



import com.example.demo.entities.CostumerEntity;
import com.example.demo.services.CostumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/costumers")
public class CostumerRestController {
    @Autowired
    private CostumerService costumerService;

    @GetMapping()
    public List<CostumerEntity>find() {
        return  costumerService.find();
    }
}

