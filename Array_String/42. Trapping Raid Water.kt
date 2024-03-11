class Solution {
    fun trap(height: IntArray): Int {
        val n = height.size
        var ans = 0
        val l = IntArray(n) { 0 } // l[i] := max(height[0..i])
        val r = IntArray(n) { 0 } // r[i] := max(height[i..n))

        for (i in 0 until n)
            l[i] = if (i == 0) height[i] else maxOf(height[i], l[i - 1])

        for (i in n - 1 downTo 0)
            r[i] = if (i == n - 1) height[i] else maxOf(height[i], r[i + 1])

        for (i in 0 until n)
            ans += minOf(l[i], r[i]) - height[i]

        return ans
    }
}