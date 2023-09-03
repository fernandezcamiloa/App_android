package com.tpfinal.appfinalargentinaprograma.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*
import com.tpfinal.appfinalargentinaprograma.R

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        buttonCompare.setOnClickListener {
            val texto1 = editText1.text.toString()
            val texto2 = editText2.text.toString()

            val resultado = viewModel.compararTextos(texto1, texto2)

            textViewResult.text = if (resultado) "Los textos son iguales" else "Los textos son diferentes"
        }
    }
}
