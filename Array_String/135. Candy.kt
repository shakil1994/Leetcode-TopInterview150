class Solution {
    fun candy(ratings: IntArray): Int {
        val n = ratings.size

        var ans = 0
        val l = IntArray(n) { 1 }
        val r = IntArray(n) { 1 }

        for (i in 1 until n)
            if (ratings[i] > ratings[i - 1])
                l[i] = l[i - 1] + 1

        for (i in n - 2 downTo 0)
            if (ratings[i] > ratings[i + 1])
                r[i] = r[i + 1] + 1

        for (i in 0 until n)
            ans += maxOf(l[i], r[i])

        return ans
    }
}