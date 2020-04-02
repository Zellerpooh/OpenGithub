package com.zeller.ommon

import com.zeller.ommon.ext.no
import com.zeller.ommon.ext.otherwise
import com.zeller.ommon.ext.yes
import org.junit.Assert
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
    fun testBoolean() {
        val resultOtherwise = false.yes {
            1
        }.otherwise {
            2
        }
        Assert.assertEquals(resultOtherwise, 2)

        val result = true.no{
            1
        }.otherwise{
            2
        }
        Assert.assertEquals(result, 2)
    }
}
