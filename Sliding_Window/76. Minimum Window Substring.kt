class Solution {
    fun minWindow(s: String, t: String): String {
        val tCount = mutableMapOf<Char, Int>()
        for (char in t) {
            tCount[char] = tCount.getOrDefault(char, 0) + 1
        }

        var left = 0
        var minLen = Int.MAX_VALUE
        var minStart = 0
        var count = 0

        for (right in s.indices) {
            val charRight = s[right]
            if (tCount.containsKey(charRight)) {
                tCount[charRight] = tCount[charRight]!! - 1
                if (tCount[charRight]!! >= 0) {
                    count++
                }
            }

            while (count == t.length) {
                val charLeft = s[left]
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1
                    minStart = left
                }

                if (tCount.containsKey(charLeft)) {
                    tCount[charLeft] = tCount[charLeft]!! + 1
                    if (tCount[charLeft]!! > 0) {
                        count--
                    }
                }
                left++
            }
        }

        return if (minLen == Int.MAX_VALUE) "" else s.substring(minStart, minStart + minLen)
    }
}