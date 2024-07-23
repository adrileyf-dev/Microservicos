package com.example.payroll.teste;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Venda {
    private Cliente cliente;
    private double valorTotal;

    public Venda(double v){
        this.valorTotal = v;
    }
    public double calcularValorFinal(){
        return  valorTotal;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "cliente=" + cliente +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
