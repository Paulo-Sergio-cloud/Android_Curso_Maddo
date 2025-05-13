package com.paulosergio.pookotlinencapsulamento

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var textTitulo : TextView
    lateinit var textAutor: TextView
    lateinit var textEditora : TextView
    lateinit var textPaginas : TextView
    lateinit var textLocalizacao : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        iniciarComponentesSoLayout()

        criarObjetos()

    }

    private fun iniciarComponentesSoLayout() {

         textTitulo = findViewById(R.id.textTituloLivro)
         textAutor = findViewById(R.id.textAutor)
         textEditora = findViewById(R.id.textEditora)
         textPaginas = findViewById(R.id.textPaginas)
         textLocalizacao = findViewById(R.id.textLocalizacao)


    }

    private fun criarObjetos() {

        var livro = Livro(
            "Kotlin",
            "Maddo",
            "Mundial POO",
            274,
            "L1L1"
        )

        val titulo = livro.titulo
        var autor = livro.autor
        var editora = livro.editora
        var paginas = livro.paginas
        var localizacao = livro.localizacao

        Log.i("POO", "Objeto Livro - Autor  : " + autor);
        Log.i("POO", "Objeto Livro - Título : " + titulo);
        Log.i("POO", "Objeto Livro - Editora: " + editora);
        Log.i("POO", "Objeto Livro - Páginas: " + paginas);
        Log.i("POO", "Objeto Livro - Localização: " + localizacao);

        textTitulo.setText(titulo)
        textAutor.setText(livro.autor)
        textEditora.setText(livro.editora)
        textPaginas.setText(livro.paginas.toString())
        textLocalizacao.setText(localizacao)


    }
}