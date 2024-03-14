class Solution {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1

        while (left < right) {
            // Skip non-alphanumeric characters from left
            while (left < right && !s[left].isLetterOrDigit()) {
                left++
            }
            // Skip non-alphanumeric characters from right
            while (left < right && !s[right].isLetterOrDigit()) {
                right--
            }
            // Compare characters at left and right positions
            if (left < right && s[left].toLowerCase() != s[right].toLowerCase()) {
                return false
            }
            left++
            right--
        }
        return true
    }
}