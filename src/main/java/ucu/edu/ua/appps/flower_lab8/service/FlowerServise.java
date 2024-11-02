package ucu.edu.ua.appps.flower_lab8.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ucu.edu.ua.appps.flower_lab8.model.Flower;
import ucu.edu.ua.appps.flower_lab8.repository.FlowerRepository;

@Service
public class FlowerServise {
    private FlowerRepository flowerRepository;

    @Autowired
    public FlowerServise(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }

    public Flower creatFlower(Flower flower) {
        return flowerRepository.save(flower);
    }
}
