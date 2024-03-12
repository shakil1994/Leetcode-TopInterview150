class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) {
            return ""
        }

        val firstString = strs[0]
        val commonPrefixBuilder = StringBuilder()

        for (i in firstString.indices) {
            val currentChar = firstString[i]

            for (j in 1 until strs.size) {
                if (i >= strs[j].length || strs[j][i] != currentChar) {
                    return commonPrefixBuilder.toString()
                }
            }

            commonPrefixBuilder.append(currentChar)
        }

        return commonPrefixBuilder.toString()
    }
}