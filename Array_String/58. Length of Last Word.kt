class Solution {
    fun lengthOfLastWord(s: String): Int {
        val trimmedString = s.trim() // Trim leading and trailing whitespaces
        val lastSpaceIndex = trimmedString.lastIndexOf(' ')

        return if (lastSpaceIndex == -1) {
            trimmedString.length
        } else {
            trimmedString.length - lastSpaceIndex - 1
        }
    }
}