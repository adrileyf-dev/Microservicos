package com.example.payroll.teste;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class VendaComDesconto extends Venda {
    private double percentualDeconto;

    public VendaComDesconto(Cliente cliente, double valorTotal, double percentualDesconto) {
        super(cliente, valorTotal);
        this.percentualDeconto = percentualDesconto;
    }
    //subescrever metodo para calcular percentual de dedconto
    @Override
    public double calcularValorFinal() {
        double desconto = getValorTotal() * (percentualDeconto / 100);
        return getValorTotal() - desconto;
    }
    @Override
    public String toString() {
        return "VendaComDesconto{" +
                "cliente=" + getCliente() +
                ", valorTotal=" + getValorTotal() +
                ", percentualDesconto=" + percentualDeconto +
                '}';

    }
}
