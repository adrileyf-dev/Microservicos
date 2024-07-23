package com.example.payroll.teste;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("ADRILEY FRANCISICO ALMEIDA PEREIRA","TESTE");
        Venda venda = new Venda(cliente,1000);
        VendaComImposto vendaComImposto = new VendaComImposto(100,15);

        VendaComDesconto vendaComDesconto = new VendaComDesconto(cliente,1000,10);
        System.out.println("Venda sem desconto: " + venda.calcularValorFinal());
        System.out.println("Venda com desconto: " + vendaComDesconto.calcularValorFinal());
        System.out.println("Valor final da venda com imposto: " + vendaComImposto.calcularValorFinal());
    }
}
