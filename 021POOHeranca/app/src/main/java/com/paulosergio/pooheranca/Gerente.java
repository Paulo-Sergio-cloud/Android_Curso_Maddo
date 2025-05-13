package com.paulosergio.pooheranca;

public class Gerente extends Funcionario{

    private double comissao;
    private int totalFuncionario;


    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getTotalFuncionarios() {
        return totalFuncionario;
    }

    public void setTotalFuncionario(int totalFuncionario) {
        this.totalFuncionario = totalFuncionario;
    }
}
