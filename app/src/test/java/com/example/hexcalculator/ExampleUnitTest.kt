package com.example.hexcalculator

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


    @Test
    fun gethex_isCorrect() {
        var cu = ComputeUnit(30)
        cu.num = 10
        assertEquals("A", cu.get_hex())
    }

    @Test
    fun del_char_isCorrect() {
        var cu = ComputeUnit(30)
        cu.del_tail_char()
        assertEquals(3, cu.num)
    }

}