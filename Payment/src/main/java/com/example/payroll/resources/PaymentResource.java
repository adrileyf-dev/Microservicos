package com.example.payroll.resources;

import com.example.payroll.entities.Payment;
import com.example.payroll.services.PaymentServices;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

    public final PaymentServices paymentServices;
    @HystrixCommand(fallbackMethod = "getPaymentAlternative")
    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days){
        Payment payment = paymentServices.getPayment(workerId,days);
        return ResponseEntity.ok(payment);
    }
    public ResponseEntity<Payment> getPaymentAlternative( Long workerId, @PathVariable Integer days){
        Payment payment = new Payment("Juca da silva",25.55,25);
        return ResponseEntity.ok(payment);
    }
}
