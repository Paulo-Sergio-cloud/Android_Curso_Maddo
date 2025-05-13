package com.paulosergio.heranca;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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

        Funcionario paulo = new Funcionario();
        Funcionario pedro = new Funcionario();
        Gerente gerentePedro = new Gerente();

        paulo.setNome("Paulo Sergio");
        paulo.setDataAdmissao("21/11/2002");


        gerentePedro.setNome("Pedro");
        gerentePedro.setComissao(1000.50);
        gerentePedro.setSalario(2000.50);
        gerentePedro.setDataAdmissao("10/02/2007");

        String toLog = gerentePedro.getDataAdmissao();

        Log.i("INFO", "Data de admissão: " + toLog );
    }



}