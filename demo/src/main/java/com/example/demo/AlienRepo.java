package com.example.demo;

import model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlienRepo extends JpaRepository<Alien,Integer> {
}
