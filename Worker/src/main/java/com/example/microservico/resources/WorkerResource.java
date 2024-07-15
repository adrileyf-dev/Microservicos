package com.example.microservico.resources;

import com.example.microservico.entities.Worker;
import com.example.microservico.repositories.WorkRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@AllArgsConstructor
@Log4j2

@RequestMapping(value = "/workers")

public class WorkerResource {

    private  final WorkRepository workRepository;

    private Environment env;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> workerList = workRepository.findAll();
        return ResponseEntity.ok(workerList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
//
//        try{ Thread.sleep(3000L);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    //    log.info("Porta = " + env.getProperty("local.server.port"));
        Worker worker = workRepository.findById(id).get();
        return ResponseEntity.ok(worker);
    }
}
