package task_1.strategy

import task_1.Matrix

interface MatrixSortStrategy {
    fun sort(matrix: Matrix, reverse: Boolean)

    fun defaultStrategy(matrix: Matrix, reverse: Boolean, function: (Array<Int>) -> Int) {
        for (i in 1 until matrix.row) {
            var j = i - 1
            val cmp = function(matrix.data[i])
            val temp = matrix.data[i]
            while (j >= 0 && ((!reverse && cmp < function(matrix.data[j])) || (reverse && cmp > function(matrix.data[j])))) {
                matrix.data[j + 1] = matrix.data[j]
                j--
            }
            matrix.data[j + 1] = temp
        }
    }
}