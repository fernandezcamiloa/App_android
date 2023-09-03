package com.tpfinal.appfinalargentinaprograma

import com.tpfinal.appfinalargentinaprograma.view.MainViewModel
import org.junit.Test

import org.junit.Assert.*

class MainViewModelTest {

    @Test
    fun testCompararTextos_iguales() {
        val viewModel = MainViewModel()
        val resultado = viewModel.compararTextos("Hola", "Hola")
        assertTrue(resultado)
    }

    @Test
    fun testCompararTextos_diferentes() {
        val viewModel = MainViewModel()
        val resultado = viewModel.compararTextos("Hola", "Mundo")
        assertFalse(resultado)
    }
}
