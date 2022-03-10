package task_1.strategy

import task_1.Matrix

class SortByMinElement : MatrixSortStrategy {
    override fun sort(matrix: Matrix, reverse: Boolean) {
        defaultStrategy(matrix, reverse, ::findMin)
    }

    private fun findMin(row: Array<Int>): Int {
        return row.minOrNull()!!
    }
}