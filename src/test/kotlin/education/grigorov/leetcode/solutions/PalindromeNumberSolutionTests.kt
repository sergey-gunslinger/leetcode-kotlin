package education.grigorov.leetcode.solutions

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PalindromeNumberSolutionTests {

    @Test
    fun `Case 1`() {
        val solution = PalindromeNumberSolution()

        val input = 121
        val isPalindrome = solution.isPalindromeNumber(input)

        assertTrue(isPalindrome)
    }

    @Test
    fun `Case 2`() {
        val solution = PalindromeNumberSolution()

        val input = -121
        val isPalindrome = solution.isPalindromeNumber(input)

        assertTrue(isPalindrome)
    }

    @Test
    fun `Case 3`() {
        val solution = PalindromeNumberSolution()

        val input = 10
        val isPalindrome = solution.isPalindromeNumber(input)

        assertFalse(isPalindrome)
    }

}