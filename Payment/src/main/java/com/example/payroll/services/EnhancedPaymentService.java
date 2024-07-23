package com.example.payroll.services;

import com.example.payroll.entities.Payment;
import com.example.payroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnhancedPaymentService extends PaymentServices{
    @Autowired
    private WorkerFeignClient workerFeignClient;

    @Override
    public Payment getPayment(long workId, int days) {
         Payment originalPayment = super.getPayment(workId,days);
          double bonus = calcularBonus(days);
         return new Payment(originalPayment.getName(),originalPayment.getDaylyIcome()+bonus,days);
    }
    private double calcularBonus(int days) {
        return  days > 10 ? 50 : 0;
    }
}
