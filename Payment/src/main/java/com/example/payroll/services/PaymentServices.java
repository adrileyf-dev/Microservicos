package com.example.payroll.services;

import com.example.payroll.entities.Payment;
import com.example.payroll.entities.Worker;
import com.example.payroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServices {

    @Autowired
    private WorkerFeignClient workerFeignClient;
     public Payment getPayment(long workId, int days){
         Worker wokers = workerFeignClient.findById(workId).getBody();
         if(wokers== null) {
             throw new RuntimeException(" worker not found !!");
         }
          return new Payment(wokers.getName(),  wokers.getDailyIncome(), days);
     }

}
