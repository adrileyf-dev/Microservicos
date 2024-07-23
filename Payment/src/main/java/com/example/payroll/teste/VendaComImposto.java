package com.example.payroll.teste;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class VendaComImposto extends Venda {

    private double percentualImposto;

    public VendaComImposto(double valorBase, double percentualImposto) {
        super(valorBase);
        this.percentualImposto = percentualImposto;
    }

    @Override
    public double calcularValorFinal() {
        double imposto = getValorTotal() * (percentualImposto / 100);
        return getValorTotal() + imposto;
    }

    public double getPercentualImposto() {
        return percentualImposto;
    }
        public void setPercentualImposto(double percentualImposto) {
        this.percentualImposto = percentualImposto;
    }


}
