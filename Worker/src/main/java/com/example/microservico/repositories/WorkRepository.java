package com.example.microservico.repositories;

import com.example.microservico.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WorkRepository extends JpaRepository<Worker, Long> {
}

