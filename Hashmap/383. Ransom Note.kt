class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val charCounts = IntArray(26)

        // Count occurrences of each character in the magazine
        for (char in magazine) {
            charCounts[char - 'a']++
        }

        // Check if the ransom note can be constructed
        for (char in ransomNote) {
            val index = char - 'a'
            if (charCounts[index] == 0) {
                return false  // If a required character is missing in the magazine
            }
            charCounts[index]--
        }

        return true
    }
}