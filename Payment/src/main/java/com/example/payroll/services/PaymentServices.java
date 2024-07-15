package com.example.payroll.services;

import com.example.payroll.entities.Payment;
import com.example.payroll.entities.Worker;
import com.example.payroll.feignclients.WorkerFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PaymentServices {

    private final WorkerFeignClient workerFeignClient;
     public Payment getPayment(long workId, int days){
         Worker wokers = workerFeignClient.findById(workId).getBody();  //getForObject(Host + "/workers/{id}",Worker.class,uriVariables);
         return new Payment(wokers.getName(),  wokers.getDailyIncome(), days);
     }

}
