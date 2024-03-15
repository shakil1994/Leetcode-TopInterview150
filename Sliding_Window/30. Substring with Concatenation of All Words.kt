class Solution {
    fun findSubstring(s: String, words: Array<String>): List<Int> {
        val result = mutableListOf<Int>()
        val wordLength = words[0].length
        val wordCount = words.size
        val totalLength = wordLength * wordCount
        val wordMap = mutableMapOf<String, Int>()

        // Create a map of words and their occurrences in the words array
        words.forEach { word ->
            wordMap[word] = wordMap.getOrDefault(word, 0) + 1
        }

        for (i in 0 until wordLength) {
            var left = i
            var right = i
            var count = 0
            val currentMap = mutableMapOf<String, Int>()

            while (right + wordLength <= s.length) {
                val word = s.substring(right, right + wordLength)
                right += wordLength
                if (wordMap.containsKey(word)) {
                    currentMap[word] = currentMap.getOrDefault(word, 0) + 1
                    count++
                    while (currentMap[word]!! > wordMap[word]!!) {
                        val leftWord = s.substring(left, left + wordLength)
                        left += wordLength
                        currentMap[leftWord] = currentMap[leftWord]!! - 1
                        count--
                    }
                    if (count == wordCount) {
                        result.add(left)
                    }
                } else {
                    currentMap.clear()
                    count = 0
                    left = right
                }
            }
        }

        return result
    }
}