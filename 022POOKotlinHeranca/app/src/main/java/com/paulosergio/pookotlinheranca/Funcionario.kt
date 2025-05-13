package com.paulosergio.pookotlinheranca

open class Funcionario(){

    private var nome: String? = null
    private var dataAdmissao: String? = null
    private var salario: Int? = 0

    fun getNome(): String{
        return nome!!
    }

    fun setNome(nome: String?){
        this.nome = nome
    }

    fun getDataAdmissao(): String{
        return dataAdmissao!!
    }

    fun setDataAdmissao(dataAdmissao: String?){
        this.dataAdmissao = dataAdmissao
    }

    fun getSalario(): Int{
        return salario!!
    }

    fun setSalario(salario: Int?){
        this.salario = salario
    }

}