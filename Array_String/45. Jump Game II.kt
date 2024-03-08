class Solution {
    fun jump(nums: IntArray): Int {
        var ans = 0
        var end = 0
        var farthest = 0

        // Start an implicit BFS.
        for (i in 0 until nums.size - 1) {
            farthest = maxOf(farthest, i + nums[i])
            if (farthest >= nums.size - 1) {
                ++ans
                break
            }
            if (i == end) {   // Visited all the items on the current level.
                ++ans          // Increment the level.
                end = farthest  // Make the queue size for the next level.
            }
        }

        return ans
    }
}