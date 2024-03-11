class Solution {
    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        val gasSum = gas.sum()
        val costSum = cost.sum()

        if (gasSum - costSum < 0) {
            return -1
        }

        var ans = 0
        var sum = 0

        // Try to start from each index.
        for (i in gas.indices) {
            sum += gas[i] - cost[i]
            if (sum < 0) {
                sum = 0
                ans = i + 1 // Start from the next index.
            }
        }

        return ans
    }
}