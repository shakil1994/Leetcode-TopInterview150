class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        // var i = m - 1
        // var j = n - 1
        // var k = m + n - 1

        // while (i >= 0 && j >= 0) {
        //     if (nums1[i] > nums2[j]) {
        //         nums1[k] = nums1[i]
        //         i--
        //     } else {
        //         nums1[k] = nums2[j]
        //         j--
        //     }
        //     k--
        // }

        // // If there are remaining elements in nums2, copy them to nums1
        // while (j >= 0) {
        //     nums1[k] = nums2[j]
        //     j--
        //     k--
        // }

        var i = m - 1
        var j = n - 1
        var k = m + n - 1

        while (k >= 0) {
            if (i < 0) nums1[k] = nums2[j--]
            else if (j < 0) nums1[k] = nums1[i--]
            else if (nums1[i] > nums2[j]) nums1[k] = nums1[i--]
            else nums1[k] = nums2[j--]
            k--
        }
    }
}