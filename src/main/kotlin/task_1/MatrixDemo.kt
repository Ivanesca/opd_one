package task_1

import task_1.strategy.MatrixSortStrategy
import task_1.strategy.SortByMaxElement
import task_1.strategy.SortByMinElement
import task_1.strategy.SortByRowSum

fun main() {
    val matrix = Matrix(
        arrayOf(
            arrayOf(2, 3, 4),
            arrayOf(10, 0, 1),
            arrayOf(1, 1, 1),
            arrayOf(2, 1, 1)
        )
    )
    printMatrix(matrix)
    var strategy: MatrixSortStrategy = SortByRowSum()
    var reverse: Boolean
    while (true) {
        println("Вид сортировки: ")
        println("1/10 - по возрастания/убывания сумм элементов строк матриц")
        println("2/20 - по возрастанию/убыванию максимального элемента в строке матриц")
        println("3/30 - по возрастанию/убыванию минимального элемента в строке матриц")
        var answer = readLine()?.toIntOrNull() ?: continue
        reverse = answer % 10 == 0
        answer %= 10
        when (answer) {
            1 -> {
                strategy = SortByRowSum()
            }
            2 -> {
                strategy = SortByMaxElement()
            }
            3 -> {
                strategy = SortByMinElement()
            }
        }
        strategy.sort(matrix, reverse)
        printMatrix(matrix)
    }
}

fun printMatrix(matrix: Matrix) {
    matrix.data.forEach { row ->
            row.forEach { element -> print("$element ") }
            println()
    }
}