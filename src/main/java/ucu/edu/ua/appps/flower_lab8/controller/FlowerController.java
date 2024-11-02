package ucu.edu.ua.appps.flower_lab8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ucu.edu.ua.appps.flower_lab8.model.Flower;
import ucu.edu.ua.appps.flower_lab8.service.FlowerServise;

public class FlowerController {
    private FlowerServise flowerServise;

    @Autowired
    public FlowerController(FlowerServise flowerServise) {
        this.flowerServise = flowerServise;
    }

    @GetMapping("/flower")
    public List<Flower> getFlowers() {
        return flowerServise.getFlowers();
    }

    @PostMapping
    public Flower creatFlower(@RequestBody Flower flower) {
        return flowerServise.creatFlower(flower);
    }
    
}