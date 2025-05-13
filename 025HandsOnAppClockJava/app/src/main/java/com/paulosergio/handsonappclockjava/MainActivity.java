package com.paulosergio.handsonappclockjava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.time.Clock;

public class MainActivity extends AppCompatActivity {

    private TextView txtUpdadeHoraAtual;
    private TextClock txtHoraAtual, txtHora24PM_AM;
    private Button btnUpdadeHoraAtual;


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

        iniciarComonentesDeLayout();
        
        capturarHoraAtual();

    }

    private void capturarHoraAtual() {

        btnUpdadeHoraAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtUpdadeHoraAtual.setText("Hora: "+txtHoraAtual.getText()+"\n\nHora: "+txtHora24PM_AM.getText());

            }
        });

    }

    private void iniciarComonentesDeLayout(){

        txtUpdadeHoraAtual = findViewById(R.id.txtUpdateHoraAtual);
        txtHoraAtual = findViewById(R.id.txtHoraAtual);
        txtHora24PM_AM = findViewById(R.id.txtHora24PM_AM);
        btnUpdadeHoraAtual = findViewById(R.id.btnUpdateHoraAtual);

    }

}