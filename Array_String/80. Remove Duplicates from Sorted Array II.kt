class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var count = 1
        var appear = 1

        for (i in 1 until nums.size) {
            if (nums[i] == nums[i - 1]) {
                if (appear == 1) {
                    nums[count] = nums[i]
                    count++
                    appear++
                } else if (appear == 2) {
                    continue
                }
            } else {
                nums[count] = nums[i]
                count++
                appear = 1
            }
        }

        return count
    }
}