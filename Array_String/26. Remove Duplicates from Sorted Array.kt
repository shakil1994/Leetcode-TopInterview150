class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }

        var uniqueCount = 1 // Initialize with 1 since the first element is always unique

        for (i in 1 until nums.size) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i]
                uniqueCount++
            }
        }

        return uniqueCount
    }
}