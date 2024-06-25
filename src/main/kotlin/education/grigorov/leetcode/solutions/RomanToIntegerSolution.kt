package education.grigorov.leetcode.solutions

/**
 * "Roman to Integer" problem solution.
 * Problem detail: https://leetcode.com/problems/roman-to-integer/description/
 */
class RomanToIntegerSolution {

    fun romanToInt(roman: String): Int {
        val preset = mapOf(
            "I" to 1,
            "IV" to 4,
            "V" to 5,
            "IX" to 9,
            "X" to 10,
            "XL" to 40,
            "L" to 50,
            "XC" to 90,
            "C" to 100,
            "CD" to 400,
            "D" to 500,
            "CM" to 900,
            "M" to 1000
        )

        var result = 0
        var iteration = 0

        while (iteration < roman.length) {
            val currentIndex = iteration
            val currentItem = roman[iteration]

            if (currentIndex != roman.lastIndex) {
                val nextIndex = currentIndex + 1
                val nextItem = roman[nextIndex]

                val combinedItems = "$currentItem$nextItem"

                preset[combinedItems]?.let {
                    result += it
                    iteration += 2
                } ?: preset[currentItem.toString()]?.let {
                    result += it
                    iteration++
                }
            } else {
                result += preset[currentItem.toString()] ?: 0
                iteration++
            }
        }

        return result
    }

}
