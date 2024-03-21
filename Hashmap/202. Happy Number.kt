class Solution {
    fun isHappy(n: Int): Boolean {
        var slow = n
        var fast = n
        do {
            slow = computeSquareSum(slow)
            fast = computeSquareSum(computeSquareSum(fast))
        } while (slow != fast)

        return slow == 1
    }

    private fun computeSquareSum(n: Int): Int {
        var sum = 0
        var num = n
        while (num > 0) {
            val digit = num % 10
            sum += digit * digit
            num /= 10
        }
        return sum
    }
}