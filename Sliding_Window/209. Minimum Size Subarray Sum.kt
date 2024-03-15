class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var minLength = Int.MAX_VALUE
        var left = 0
        var sum = 0
        
        for (right in nums.indices) {
            sum += nums[right]
            while (sum >= target) {
                minLength = minOf(minLength, right - left + 1)
                sum -= nums[left]
                left++
            }
        }
        
        return if (minLength == Int.MAX_VALUE) 0 else minLength
    }
}