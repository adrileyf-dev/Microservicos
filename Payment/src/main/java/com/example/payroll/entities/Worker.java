package com.example.payroll.entities;

import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Worker {
    private Long id;
    private String name;
    private Double dailyIncome;
}
