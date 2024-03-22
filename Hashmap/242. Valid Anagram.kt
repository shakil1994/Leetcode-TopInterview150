class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        
        val charCounts = IntArray(26)
        
        // Count occurrences of characters in string s
        for (char in s) {
            charCounts[char - 'a']++
        }
        
        // Decrement counts for characters in string t
        for (char in t) {
            val index = char - 'a'
            if (charCounts[index] == 0) {
                return false  // If a character in t doesn't exist in s
            }
            charCounts[index]--
        }
        
        return true
    }
}