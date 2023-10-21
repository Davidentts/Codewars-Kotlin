package kot.CodeWars.Tests

import kot.CodeWars.tribonacci
import org.junit.Assert.assertArrayEquals
import org.junit.Test

class `5kyu-My-smallest-code-interpreter_Test` {

    private val precision = 1e-10;

    @Test
    fun basicTests() {
        assertArrayEquals(doubleArrayOf(1.0,1.0,1.0,3.0,5.0,9.0,17.0,31.0,57.0,105.0), tribonacci(doubleArrayOf(1.0,1.0,1.0),10), precision)
        assertArrayEquals(doubleArrayOf(0.0,0.0,1.0,1.0,2.0,4.0,7.0,13.0,24.0,44.0), tribonacci(doubleArrayOf(0.0,0.0,1.0),10), precision)
        assertArrayEquals(doubleArrayOf(0.0,1.0,1.0,2.0,4.0,7.0,13.0,24.0,44.0,81.0), tribonacci(doubleArrayOf(0.0,1.0,1.0),10), precision)
        assertArrayEquals(doubleArrayOf(1.0,0.0,0.0,1.0,1.0,2.0,4.0,7.0,13.0,24.0), tribonacci(doubleArrayOf(1.0,0.0,0.0),10), precision)
        assertArrayEquals(doubleArrayOf(0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0), tribonacci(doubleArrayOf(0.0,0.0,0.0),10), precision)
        assertArrayEquals(doubleArrayOf(1.0,2.0,3.0,6.0,11.0,20.0,37.0,68.0,125.0,230.0), tribonacci(doubleArrayOf(1.0,2.0,3.0),10), precision)
        assertArrayEquals(doubleArrayOf(3.0,2.0,1.0,6.0,9.0,16.0,31.0,56.0,103.0,190.0), tribonacci(doubleArrayOf(3.0,2.0,1.0),10), precision)
        assertArrayEquals(doubleArrayOf(1.0), tribonacci(doubleArrayOf(1.0,1.0,1.0),1), precision)
        assertArrayEquals(doubleArrayOf(), tribonacci(doubleArrayOf(300.0,200.0,100.0),0), precision)
        assertArrayEquals(doubleArrayOf(0.5,0.5,0.5,1.5,2.5,4.5,8.5,15.5,28.5,52.5,96.5,177.5,326.5,600.5,1104.5,2031.5,3736.5,6872.5,12640.5,23249.5,42762.5,78652.5,144664.5,266079.5,489396.5,900140.5,1655616.5,3045153.5,5600910.5,10301680.5), tribonacci(doubleArrayOf(0.5,0.5,0.5),30), precision)
    }

}