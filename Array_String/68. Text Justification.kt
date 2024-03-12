class Solution {
    fun fullJustify(words: Array<String>, maxWidth: Int): List<String> {
        val ans = mutableListOf<String>()
        val row = mutableListOf<StringBuilder>()
        var rowLetters = 0

        for (word in words) {
            // If we place the word in this row, it will exceed the maximum width.
            // Therefore, we cannot put the word in this row and have to pad spaces
            // for each word in this row.
            if (rowLetters + row.size + word.length > maxWidth) {
                val spaces = maxWidth - rowLetters
                if (row.size == 1) {
                    // Pad all the spaces after row[0].
                    for (i in 0 until spaces) {
                        row[0].append(" ")
                    }
                } else {
                    // Evenly pad all the spaces to each word (expect the last one) in
                    // this row.
                    for (i in 0 until spaces) {
                        row[i % (row.size - 1)].append(" ")
                    }
                }
                val joinedRow = row.joinToString("")
                ans.add(joinedRow)
                row.clear()
                rowLetters = 0
            }
            row.add(StringBuilder(word))
            rowLetters += word.length
        }

        val lastRow = row.joinToString(" ")
        val sb = StringBuilder(lastRow)
        val spacesToBeAdded = maxWidth - sb.length
        for (i in 0 until spacesToBeAdded) {
            sb.append(" ")
        }

        ans.add(sb.toString())
        return ans
    }
}