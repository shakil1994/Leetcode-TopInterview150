class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val numSet = nums.toHashSet()
        var longestStreak = 0
        
        for (num in numSet) {
            // Check if the current number is the start of a sequence
            if (!numSet.contains(num - 1)) {
                var currentNum = num
                var currentStreak = 1
                
                // Find the length of the consecutive sequence
                while (numSet.contains(currentNum + 1)) {
                    currentNum++
                    currentStreak++
                }
                
                // Update the longest streak if necessary
                longestStreak = maxOf(longestStreak, currentStreak)
            }
        }
        
        return longestStreak
    }
}