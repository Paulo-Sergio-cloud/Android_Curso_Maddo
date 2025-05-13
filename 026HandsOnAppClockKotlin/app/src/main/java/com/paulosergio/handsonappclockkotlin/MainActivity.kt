package com.paulosergio.handsonappclockkotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextClock
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var txtHoraAtual: TextClock? = null
    private var txtHora24AM_PM: TextClock? = null
    private var txtUpdateHoraAtual: TextView? = null
    private var btnUpdateHoraAtual: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        iniciarComponentesDeLayout()

    }

    private fun iniciarComponentesDeLayout() {

        txtHoraAtual = findViewById(R.id.txtHoraAtual)
        txtHora24AM_PM = findViewById(R.id.txtHora24AM_PM)
        txtUpdateHoraAtual = findViewById(R.id.txtUpdateHoraAtual)
        btnUpdateHoraAtual = findViewById(R.id.btnUpdateHoraAtual)

    }

    fun atualizarHora(view: View) {

        txtUpdateHoraAtual!!.setText("Hora: "+txtHora24AM_PM!!.getText())

    }
}