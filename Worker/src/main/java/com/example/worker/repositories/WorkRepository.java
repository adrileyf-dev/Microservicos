package com.example.worker.repositories;

import com.example.worker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WorkRepository extends JpaRepository<Worker, Long> {
}

