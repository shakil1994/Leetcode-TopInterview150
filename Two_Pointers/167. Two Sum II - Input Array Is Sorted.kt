class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (i in numbers.indices) {
            val complement = target - numbers[i]
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i + 1)
            }
            map[numbers[i]] = i + 1
        }
        return intArrayOf()
    }
}