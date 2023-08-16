package com.example.demo;

import model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;
@Component
public class Service{
    @Autowired
    AlienRepo repo;
    public List<Alien> getAliens(){
        return repo.findAll();
    }
    public Optional<Alien> getAlienByiD(int ID){
        return  repo.findById(ID);
    }
}
