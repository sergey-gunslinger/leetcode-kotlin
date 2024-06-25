package education.grigorov.leetcode.solutions

/**
 * The "Two Sum" problem solution.
 * Problem link: https://leetcode.com/problems/two-sum/
 */
class TwoSumSolution {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val cache = HashMap<Int, Int>()

        for (currentIndex in nums.indices) {
            val currentItem = nums[currentIndex]
            val subtract = target - currentItem

            if (cache.contains(subtract)) {
                val foundIndex = cache[subtract] ?: currentIndex
                if (currentIndex != foundIndex) return intArrayOf(foundIndex, currentIndex)
            }

            cache[currentItem] = currentIndex
        }

        return intArrayOf()
    }

}
