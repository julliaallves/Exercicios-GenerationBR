package programacaoorientadaaobjetosemkotlin.exerccincodepoo

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Calculadorajunittest {

    @Test
    fun somaTest() {
        assertEquals(3.0, Calculadorajunit.soma(2.0, 1.0))
    }

    @Test
    fun subTest() {
        assertEquals(1.0, Calculadorajunit.sub(2.0, 1.0))
    }

    @Test
    fun divTest() {
        assertEquals(2.0, Calculadorajunit.div(10.0, 5.0))
    }

    @Test
    fun multTest() {
        assertEquals(2.0, Calculadorajunit.mult(2.0, 1.0))
    }

    @Test
    fun potTest() {
        assertEquals(4.0, Calculadorajunit.pot(2.0, 2.0))
    }

    @Test
    fun raizTest() {
        assertEquals(3.0, Calculadorajunit.raiz(9.0))
    }

}