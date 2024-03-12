class Solution {
    fun strStr(haystack: String, needle: String): Int {
        val haystackLength = haystack.length
        val needleLength = needle.length

        if (needleLength == 0) {
            return 0 // Empty needle is always present at the beginning of the haystack
        }

        if (haystackLength < needleLength) {
            return -1 // Needle can't be present if it's longer than the haystack
        }

        for (i in 0..haystackLength - needleLength) {
            if (haystack.substring(i, i + needleLength) == needle) {
                return i
            }
        }

        return -1 // Needle not found in the haystack
    }
}