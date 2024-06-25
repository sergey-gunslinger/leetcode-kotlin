package education.grigorov.leetcode.solutions

import kotlin.test.Test
import kotlin.test.assertTrue

class TwoSumSolutionTests {

    @Test
    fun `Case 1`() {
        val solution = TwoSumSolution()

        val expected = intArrayOf(0, 1)

        val input = intArrayOf(2, 7, 11, 15)
        val target = 9

        val actual = solution.twoSum(input, target)

        val isEquals = expected.contentEquals(actual)
        assertTrue(isEquals)
    }

    @Test
    fun `Case 2`() {
        val solution = TwoSumSolution()

        val expected = intArrayOf(1, 2)

        val input = intArrayOf(3, 2, 4)
        val target = 6

        val actual = solution.twoSum(input, target)

        val isEquals = expected.contentEquals(actual)
        assertTrue(isEquals)
    }

    @Test
    fun `Case 3`() {
        val solution = TwoSumSolution()

        val expected = intArrayOf(0, 1)

        val input = intArrayOf(3, 3)
        val target = 6

        val actual = solution.twoSum(input, target)

        val isEquals = expected.contentEquals(actual)
        assertTrue(isEquals)
    }

}
