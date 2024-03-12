class Solution {
    fun intToRoman(num: Int): String {
        val values = intArrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
        val numerals = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")

        var result = ""
        var remaining = num

        for (i in values.indices) {
            while (remaining >= values[i]) {
                result += numerals[i]
                remaining -= values[i]
            }
        }

        return result
    }
}