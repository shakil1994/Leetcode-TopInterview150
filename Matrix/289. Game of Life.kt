class Solution {
    fun gameOfLife(board: Array<IntArray>): Unit {
        val m = board.size
        val n = board[0].size

        val directions = arrayOf(
            intArrayOf(-1, -1), intArrayOf(-1, 0), intArrayOf(-1, 1),
            intArrayOf(0, -1), intArrayOf(0, 1),
            intArrayOf(1, -1), intArrayOf(1, 0), intArrayOf(1, 1)
        )

        for (i in board.indices) {
            for (j in board[i].indices) {
                var liveNeighbors = 0
                for (dir in directions) {
                    val ni = i + dir[0]
                    val nj = j + dir[1]
                    if (ni in 0 until m && nj in 0 until n && (board[ni][nj] == 1 || board[ni][nj] == -1)) {
                        liveNeighbors++
                    }
                }
                if (board[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    // Rule 1 and Rule 3: Any live cell with fewer than two live neighbors dies,
                    // and any live cell with more than three live neighbors dies.
                    board[i][j] = -1
                } else if (board[i][j] == 0 && liveNeighbors == 3) {
                    // Rule 4: Any dead cell with exactly three live neighbors becomes a live cell.
                    board[i][j] = 2
                }
            }
        }

        // Update the board after all cell statuses have been calculated.
        for (i in board.indices) {
            for (j in board[i].indices) {
                if (board[i][j] == -1) {
                    board[i][j] = 0
                } else if (board[i][j] == 2) {
                    board[i][j] = 1
                }
            }
        }
    }
}