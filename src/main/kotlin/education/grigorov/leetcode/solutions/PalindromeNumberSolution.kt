package education.grigorov.leetcode.solutions

/**
 * Solution of "Palindrome number" problem.
 * Problem detail: https://leetcode.com/problems/palindrome-number/
 */
class PalindromeNumberSolution {

    fun isPalindromeNumber(number: Int): Boolean {
        var input = number
        var reversedInt = 0

        while (input > 0) {
            reversedInt = reversedInt * 10 + input % 10
            input /= 10
        }

        return reversedInt == number
    }

}
