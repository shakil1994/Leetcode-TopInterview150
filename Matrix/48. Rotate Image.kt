class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        // Transpose the matrix
        for (i in matrix.indices) {
            for (j in i until matrix[0].size) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
            }
        }
        
        // Reverse each row
        for (row in matrix) {
            reverseArray(row)
        }
    }
    private fun reverseArray(arr: IntArray) {
        var left = 0
        var right = arr.size - 1
        while (left < right) {
            val temp = arr[left]
            arr[left] = arr[right]
            arr[right] = temp
            left++
            right--
        }
    }
}