package com.paulosergio.pooheranca;

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
        Funcionario joao = new Funcionario();

        Gerente pedro = new Gerente();


        paulo.setNome("Paulo Gomes");
        paulo.setDataAdmissao("23/05/2012");
        paulo.setSalario(1500.45);

        pedro.setComissao(15);
        pedro.setTotalFuncionario(10);
        pedro.setNome("Pedro Geraldo");
        pedro.setDataAdmissao("12/11/1998");
        pedro.setSalario(2000.67);

        Log.i("Funcionarios", "Nome: "+pedro.getNome());
        Log.i("Funcionarios", "data de admissão: "+pedro.getDataAdmissao());
        Log.i("Funcionarios", "Salario: "+pedro.getSalario());
        Log.i("Funcionarios", "comissão: "+pedro.getComissao());
        Log.i("Funcionarios", "total funcionários: "+pedro.getTotalFuncionarios());

    }
}