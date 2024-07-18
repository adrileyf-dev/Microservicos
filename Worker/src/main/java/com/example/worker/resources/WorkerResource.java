package com.example.worker.resources;

import com.example.worker.entities.Worker;
import com.example.worker.repositories.WorkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController


@RequestMapping(value = "/workers")

public class WorkerResource {
    private static Logger logger = LoggerFactory.getLogger(WorkerResource.class);
    @Value("${worker.config}")
    private String testConfig;

     @Autowired
     WorkRepository workRepository;


    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> workerList = workRepository.findAll();
        return ResponseEntity.ok(workerList);
    }

    @GetMapping(value = "configs")
    public ResponseEntity<Void> getConfigs() {
        logger.info("CONFIG = " + testConfig);

        return ResponseEntity.noContent().build();
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
