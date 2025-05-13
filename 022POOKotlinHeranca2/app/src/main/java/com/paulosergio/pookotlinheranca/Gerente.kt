package com.paulosergio.pookotlinheranca

 class Gerente: Funcionario() {

    private var comissao: Double? = null
    private var totalFuncionarios: Int? = null


    fun getComissao(): Double{
        return comissao!!
    }

    fun setComissao(comissao: Double?){
        this.comissao = comissao
    }

    fun getTotalFuncionarios(): Int{
        return totalFuncionarios!!
    }

    fun setTotalFuncionarios(totalFuncionarios: Int?){
        this.totalFuncionarios = totalFuncionarios
    }
}