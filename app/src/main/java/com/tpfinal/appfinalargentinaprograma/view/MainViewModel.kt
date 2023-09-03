package com.tpfinal.appfinalargentinaprograma.view

import androidx.lifecycle.ViewModel
import com.tpfinal.appfinalargentinaprograma.model.TextComparisonModel

class MainViewModel : ViewModel() {
    private val textComparisonModel = TextComparisonModel()

    fun compararTextos(texto1: String, texto2: String): Boolean {
        return textComparisonModel.compararTextos(texto1, texto2)
    }
}