package com.example.demo;

import model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class Controller {
    @Autowired
    Service obj;

    @GetMapping("/getService")
    public List<Alien> service(){
        return obj.getAliens();
    }

    @GetMapping("/getService {id}")
    public Optional<Alien> getStudents(@PathVariable Integer id){
        return obj.getAlienByiD(id);
    }
    @PostMapping("/insert")
    public String insert(){
        return "Successfully inserted the date";
    }
    @DeleteMapping("/delete{id}")
    public  String delete(@PathVariable Long id){
        return  "Deleted ID: "+ id + " successfully";
    }
    @PutMapping("/update{id}")
    public String update(@PathVariable Long id){
        return "Updated "+id+" successfully";
    }

}
