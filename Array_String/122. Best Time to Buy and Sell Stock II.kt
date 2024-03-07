class Solution {
    fun maxProfit(prices: IntArray): Int {
        var sell = 0
        var hold = Int.MIN_VALUE

        for (price in prices) {
            sell = sell.coerceAtLeast(hold + price)
            hold = hold.coerceAtLeast(sell - price)
        }

        return sell
    }
}