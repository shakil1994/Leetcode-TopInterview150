class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        
        val sToT = HashMap<Char, Char>()
        val tToS = HashMap<Char, Char>()
        
        for (i in s.indices) {
            val charS = s[i]
            val charT = t[i]
            
            // Check if the mapping is consistent
            if (sToT.containsKey(charS) && sToT[charS] != charT) {
                return false
            }
            if (tToS.containsKey(charT) && tToS[charT] != charS) {
                return false
            }
            
            // Update the mappings
            sToT[charS] = charT
            tToS[charT] = charS
        }
        
        return true
    }
}