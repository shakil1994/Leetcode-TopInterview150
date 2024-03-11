class Solution {
    fun hIndex(citations: IntArray): Int {
        val n = citations.size

        Arrays.sort(citations)

        for (i in 0 until n) {
            if (citations[i] >= n - i) {
                return n - i
            }
        }

        return 0
    }
}