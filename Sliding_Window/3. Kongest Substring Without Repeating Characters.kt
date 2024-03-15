class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var maxLength = 0
        var left = 0
        val charIndexMap = mutableMapOf<Char, Int>()

        for(right in s.indices){
            if(charIndexMap.containsKey(s[right]) && charIndexMap[s[right]]!! >= left){
                left = charIndexMap[s[right]]!! + 1
            }
            charIndexMap[s[right]] = right
            maxLength = maxOf(maxLength, right - left + 1)
        }

        return maxLength
    }
}