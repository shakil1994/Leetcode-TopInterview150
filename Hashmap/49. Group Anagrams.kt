class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val keyToAnagrams = HashMap<String, MutableList<String>>()
        
        for (str in strs) {
            val chars = str.toCharArray()
            chars.sort()
            val key = String(chars)
            keyToAnagrams.computeIfAbsent(key) { mutableListOf() }.add(str)
        }

        return ArrayList(keyToAnagrams.values)
    }
}