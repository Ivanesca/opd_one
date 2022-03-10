package task_1.strategy

import task_1.Matrix

class SortByMaxElement : MatrixSortStrategy {
    override fun sort(matrix: Matrix, reverse: Boolean) {
        defaultStrategy(matrix, reverse, ::findMax)
    }

    private fun findMax(row: Array<Int>): Int {
        return row.maxOrNull()!!
    }
}