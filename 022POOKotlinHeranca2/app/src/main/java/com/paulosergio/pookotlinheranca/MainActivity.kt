package com.paulosergio.pookotlinheranca

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var textNome : TextView
    lateinit var textData: TextView
    lateinit var textSalario : TextView
    lateinit var textFunc : TextView
    lateinit var textComissao : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var joao = Funcionario()

        joao.setNome("Joao")
        joao.setSalario(1200)
        joao.setDataAdmissao("01/02/2024")

        var gerentePedro = Gerente()

        gerentePedro.setNome("Pedro")
        gerentePedro.setDataAdmissao("01/01/2020")
        gerentePedro.setSalario(2400)
        gerentePedro.setComissao(10.5)
        gerentePedro.setTotalFuncionarios(25)

        iniciarComponentesSoLayout()

        criarObjetos()
    }

    private fun iniciarComponentesSoLayout() {

        textNome = findViewById(R.id.textNome)
        textData = findViewById(R.id.textData)
        textSalario = findViewById(R.id.textSalario)
        textFunc = findViewById(R.id.textTotalFunc)
        textComissao = findViewById(R.id.textComissao)


    }

    private fun criarObjetos() {

        var gerente = Gerente()

        gerente.setNome("Joao Carlos")
        gerente.setDataAdmissao("01/02/2020")
        gerente.setSalario(5000)
        gerente.setTotalFuncionarios(23)
        gerente.setComissao(11.52)

        val nome = gerente.getNome()
        var data = gerente.getDataAdmissao()
        var salario = gerente.getSalario()
        var comissao = gerente.getComissao()
        var funcionarios = gerente.getTotalFuncionarios()

//        Log.i("POO", "Objeto Livro - Autor  : " + autor);
//        Log.i("POO", "Objeto Livro - Título : " + titulo);
//        Log.i("POO", "Objeto Livro - Editora: " + editora);
//        Log.i("POO", "Objeto Livro - Páginas: " + paginas);
//        Log.i("POO", "Objeto Livro - Localização: " + localizacao);

        textNome.setText(nome)
        textData.setText(data)
        textSalario.setText(salario.toString())
        textFunc.setText(funcionarios.toString())
        textComissao.setText(comissao.toString())


    }
}