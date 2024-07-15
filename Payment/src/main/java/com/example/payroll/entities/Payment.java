package com.example.payroll.entities;

import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Payment {
    private String name;
    private Double daylyIcome;
    private  int days;


    public  double getTotal(){
        return  days * daylyIcome;
    }
 }
