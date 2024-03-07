class Solution {
    fun maxProfit(prices: IntArray): Int {
        var sellOne = 0
        var holdOne = Int.MIN_VALUE

        for (price in prices) {
            sellOne = sellOne.coerceAtLeast(holdOne + price)
            holdOne = holdOne.coerceAtLeast(-price)
        }

        return sellOne
    }
}