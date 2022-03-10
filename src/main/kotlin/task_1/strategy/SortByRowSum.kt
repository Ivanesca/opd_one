package task_1.strategy

import task_1.Matrix

class SortByRowSum : MatrixSortStrategy {
    override fun sort(matrix: Matrix, reverse: Boolean) {
        defaultStrategy(matrix, reverse, ::sum)
    }

    private fun sum(row: Array<Int>): Int {
        return row.sum()
    }
}