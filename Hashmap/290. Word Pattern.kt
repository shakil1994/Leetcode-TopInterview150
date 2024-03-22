class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val words = s.split(" ")
        if (words.size != pattern.length)
            return false

        val charToIndex = HashMap<Char, Int>()
        val stringToIndex = HashMap<String, Int>()

        for (i in pattern.indices)
            if (charToIndex.put(pattern[i], i) != stringToIndex.put(words[i], i))
                return false

        return true
    }
}