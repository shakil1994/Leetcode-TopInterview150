class Solution {
    fun canJump(nums: IntArray): Boolean {
        var i = 0
        var reach = 0

        while (i < nums.size && i <= reach) {
            reach = reach.coerceAtLeast(i + nums[i])
            i++
        }

        return i == nums.size
    }
}