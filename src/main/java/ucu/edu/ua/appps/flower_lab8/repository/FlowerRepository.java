package ucu.edu.ua.appps.flower_lab8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ucu.edu.ua.appps.flower_lab8.model.Flower;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer>{

}