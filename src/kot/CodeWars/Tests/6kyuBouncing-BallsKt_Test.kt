package kot.CodeWars.Tests

import kot.CodeWars.bouncingBall
import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.Random

class _6kyuBouncing_BallsKtTest {

    @Test
    fun test1() {
        assertEquals(3, bouncingBall(3.0, 0.66, 1.5))
    }

    @Test
    fun test2() {
        assertEquals(15, bouncingBall(30.0, 0.66, 1.5))
    }

    @Test
    fun test3() {
        assertEquals(-1, bouncingBall(1.0, 0.1, 1.0))
    }

    @Test
    fun test4() {
        assertEquals(917, bouncingBall(100.0, 0.99, 1.0))
    }

    @Test
    fun test5() {
        assertEquals(1, bouncingBall(25.0, 0.1, 10.0))
    }

    @Test
    fun test6() {
        assertEquals(27, bouncingBall(1000.0, 0.5, 0.1))
    }

    @Test
    fun test() {
        val rnd = Random()
        val someheights = doubleArrayOf(12.0, 10.5, 144.0, 233.0, 15.25, 61.0, 98.0, 15.9, 25.8, 41.8, 67.0, 109.0, 17.0, 28.0, 46.0, 7.5, 12.20, 19.0, 3.0, 5.0, 83.0, 13.0, 21.0, 35.5, 57.0, 92.0, 14.0, 24.0, 39.0, 6.5)
        val someBounces = doubleArrayOf(0.6, 0.6, 0.6, 0.6, 0.6, 1.1, 9.0, 1.0, 0.6, 0.6, 0.6, 0.75, 0.75, 0.75, 0.75, 0.75, 12.20, 0.75, 0.75, 0.83, 0.13, 0.21, 0.35, 0.57, 0.9, 0.14, 0.24, 0.39, 0.65, 0.65)
        val somewin = doubleArrayOf(1.5, 1.5, 1.44, 2.33, 1.0, 6.1, 9.8, 1.9, 2.8, 4.8, 3.0, 1.09, 1.7, 2.8, 46.0, 7.5, 12.20, 1.9, 3.0, 5.0, 0.83, 1.3, 2.1, 3.5, 0.57, 0.92, 1.4, 2.4, 3.9, 6.5)
        for (k in 0..9)
        {
            val rn = rnd.nextInt(29)
            val f1 = someheights[rn]
            val f2 = someBounces[rn]
            val f3 = somewin[rn]
            println("Random test " + k)
            assertEquals(bouncingBallTest(f1, f2, f3), bouncingBall(f1, f2, f3))
        }
    }
    companion object {
        fun bouncingBallTest(hh:Double, bounce:Double, window:Double):Int {
            var h = hh
            if ((h <= 0) || (window >= h) || (bounce <= 0) || (bounce >= 1))
                return -1
            var seen = -1
            while (h > window)
            {
                seen += 2
                h = h * bounce
            }
            return seen
        }
    }

}