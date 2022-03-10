import task_1.Matrix
import task_1.strategy.SortByRowSum
import task_1.strategy.MatrixSortStrategy

fun main(args: Array<String>) {
    val matrix = Matrix(arrayOf(
        arrayOf(10, 5, 1),
        arrayOf(7, 0, 0),
        arrayOf(1, 1, 1),
        arrayOf(2, 13, 19),
        arrayOf(0, 0, 1)))

    var strategy: MatrixSortStrategy = SortByRowSum()

    strategy.sort(matrix, false)
    print(matrix)
}