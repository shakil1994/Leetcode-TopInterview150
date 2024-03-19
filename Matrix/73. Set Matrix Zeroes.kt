class Solution {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        val m = matrix.size
        val n = matrix[0].size
        var shouldFillFirstRow = false
        var shouldFillFirstCol = false

        for (j in 0 until n) {
            if (matrix[0][j] == 0) {
                shouldFillFirstRow = true
                break
            }
        }

        for (i in 0 until m) {
            if (matrix[i][0] == 0) {
                shouldFillFirstCol = true
                break
            }
        }

        // Store the information in the first row and the first column.
        for (i in 1 until m) {
            for (j in 1 until n) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0
                    matrix[0][j] = 0
                }
            }
        }

        // Fill 0s for the matrix except the first row and the first column.
        for (i in 1 until m) {
            for (j in 1 until n) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0
                }
            }
        }

        // Fill 0s for the first row if needed.
        if (shouldFillFirstRow) {
            for (j in 0 until n) {
                matrix[0][j] = 0
            }
        }

        // Fill 0s for the first column if needed.
        if (shouldFillFirstCol) {
            for (i in 0 until m) {
                matrix[i][0] = 0
            }
        }
    }
}