package com.paulosergio.pooencapsulamento;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textTituloLivro;
    private TextView textAutor;
    private TextView textEditora;
    private TextView textPaginas;
    private TextView textLocalizacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        inciarComponentesDoLayout();
        
        criarObjetos();

    }

    private void inciarComponentesDoLayout() {

        textTituloLivro = findViewById(R.id.textTituloLivro);
        textAutor = findViewById(R.id.textAutor);
        textEditora = findViewById(R.id.textEditora);
        textPaginas = findViewById(R.id.textPaginas);
        textLocalizacao = findViewById(R.id.textLocalizacao);

    }

    public void criarObjetos(){

        Livro objLivro = new Livro();
        objLivro.setAutor("Marco Maddo");
        objLivro.setTitulo("POO Encapsulamento Seguro em Java");
        objLivro.setEditora("Mundial POO");
        objLivro.setPaginas(140);
        objLivro.setLocalizacao("L1L1");

        Log.i("POO", "Objeto Livro - Autor  : " + objLivro.getAutor());
        Log.i("POO", "Objeto Livro - Título : " + objLivro.getTitulo());
        Log.i("POO", "Objeto Livro - Editora: " + objLivro.getEditora());
        Log.i("POO", "Objeto Livro - Páginas: " + objLivro.getPaginas());
        Log.i("POO", "Objeto Livro - Localização: " + objLivro.getLocalizacao());

        textTituloLivro.setText(objLivro.getTitulo());
        textAutor.setText(objLivro.getAutor());
        textEditora.setText(objLivro.getEditora());
        textPaginas.setText(objLivro.getPaginas() + "");
        textLocalizacao.setText(objLivro.getLocalizacao());

    }

}