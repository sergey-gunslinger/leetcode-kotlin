package education.grigorov.leetcode.solutions

import kotlin.test.Test
import kotlin.test.assertEquals

class RomanToIntegerSolutionTests {

    @Test
    fun `Case 1`() {
        val solution = RomanToIntegerSolution()

        val input = "III"
        val expect = 3

        val actual = solution.romanToInt(input)

        assertEquals(expect, actual)
    }

    @Test
    fun `Case 2`() {
        val solution = RomanToIntegerSolution()

        val input = "LVIII"
        val expect = 58

        val actual = solution.romanToInt(input)

        assertEquals(expect, actual)
    }

    @Test
    fun `Case 3`() {
        val solution = RomanToIntegerSolution()

        val input = "MCMXCIV"
        val expect = 1994

        val actual = solution.romanToInt(input)

        assertEquals(expect, actual)
    }

}
