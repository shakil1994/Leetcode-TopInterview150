class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        if (nums.size < 3) {
            return emptyList()
        }

        val ans = mutableListOf<List<Int>>()

        nums.sort()

        for (i in 0 until nums.size - 2) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue
            }
            var l = i + 1
            var r = nums.size - 1
            while (l < r) {
                val sum = nums[i] + nums[l] + nums[r]
                when {
                    sum == 0 -> {
                        ans.add(listOf(nums[i], nums[l], nums[r]))
                        while (l < r && nums[l] == nums[l + 1]) {
                            l++
                        }
                        while (l < r && nums[r] == nums[r - 1]) {
                            r--
                        }
                        l++
                        r--
                    }
                    sum < 0 -> {
                        l++
                    }
                    else -> {
                        r--
                    }
                }
            }
        }

        return ans
    }
}