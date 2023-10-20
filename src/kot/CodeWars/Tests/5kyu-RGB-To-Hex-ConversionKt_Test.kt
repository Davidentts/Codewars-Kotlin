package kot.CodeWars.Tests

import kot.CodeWars.rgb
import org.junit.Assert.assertEquals
import org.junit.Test

class _5kyu_RGB_To_Hex_ConversionKt_Test {

    @Test
    fun test1() {
        assertEquals("000000", rgb(0,0,0))
        assertEquals("000000", rgb(0, 0, -20))
        assertEquals("FFFFFF", rgb(300,255,255))
        assertEquals("ADFF2F", rgb(173,255,47))
        assertEquals("9400D3", rgb(148, 0, 211))
        assertEquals("0B0B0B", rgb(11, 11, 11))
    }
}
