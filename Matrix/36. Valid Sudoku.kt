class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rows = Array(9) { HashSet<Char>() }
        val cols = Array(9) { HashSet<Char>() }
        val boxes = Array(9) { HashSet<Char>() }

        for (i in board.indices) {
            for (j in board[i].indices) {
                val num = board[i][j]
                if (num != '.') {
                    // Check if the number already exists in the row, column, or box
                    if (!rows[i].add(num) || !cols[j].add(num) || !boxes[i / 3 * 3 + j / 3].add(num)) {
                        return false
                    }
                }
            }
        }

        return true
    }
}