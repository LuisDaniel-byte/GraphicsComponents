package com.example.graphicscomponents4

import android.app.Activity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MyFirstActivity : Activity() {
    lateinit var tvContador : TextView
    lateinit var btnBoton : Button
    lateinit var lvLista : ListView
    var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_my_first)

        tvContador = findViewById(R.id.tvContador)
        btnBoton = findViewById(R.id.btnBoton)

        btnBoton.setOnClickListener{
            contador++
            tvContador.text = contador.toString()
            Toast.makeText(this, contador.toString() , Toast.LENGTH_LONG).show()
        }

        var lista = listOf<String>("Luis","Daniel","Vargas","Rodriguez")

        lvLista = findViewById(R.id.lvLista)

        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,lista)
        lvLista.adapter = adapter
    }

    override fun onResume()  {
        super.onResume()

    }
}