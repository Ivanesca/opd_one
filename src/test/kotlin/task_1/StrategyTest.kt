package task_1

import task_1.strategy.MatrixSortStrategy
import task_1.strategy.SortByMaxElement
import task_1.strategy.SortByMinElement
import task_1.strategy.SortByRowSum
import kotlin.test.Test
import kotlin.test.assertEquals

class StrategyTest {
    lateinit var strategy: MatrixSortStrategy
    private val matrix: Matrix = Matrix(
        arrayOf(
            arrayOf(5, 3, 4),
            arrayOf(20, 0, 1),
            arrayOf(2, 2, 3),
            arrayOf(2, 2, -2),
            arrayOf(-1, 0, 0)
        )
    )

    @Test
    fun `Sort by sum test`() {
        strategy = SortByRowSum()
        val expectMatrix1 = Matrix(
            arrayOf(
                arrayOf(-1, 0, 0),
                arrayOf(2, 2, -2),
                arrayOf(2, 2, 3),
                arrayOf(5, 3, 4),
                arrayOf(20, 0, 1)
            )
        )
        val expectMatrix2 = Matrix(
            arrayOf(
                arrayOf(20, 0, 1),
                arrayOf(5, 3, 4),
                arrayOf(2, 2, 3),
                arrayOf(2, 2, -2),
                arrayOf(-1, 0, 0)
            )
        )

        strategy.sort(matrix, false)
        assertEquals(matrix, expectMatrix1)

        strategy.sort(matrix, true)
        assertEquals(matrix, expectMatrix2)
    }

    @Test
    fun `Sort by min element`() {
        strategy = SortByMinElement()
        val expectMatrix1 = Matrix(
            arrayOf(
                arrayOf(2, 2, -2),
                arrayOf(-1, 0, 0),
                arrayOf(20, 0, 1),
                arrayOf(2, 2, 3),
                arrayOf(5, 3, 4),
            )
        )
        val expectMatrix2 = Matrix(
            arrayOf(
                arrayOf(5, 3, 4),
                arrayOf(2, 2, 3),
                arrayOf(20, 0, 1),
                arrayOf(-1, 0, 0),
                arrayOf(2, 2, -2)
            )
        )

        strategy.sort(matrix, false)
        assertEquals(matrix, expectMatrix1)

        strategy.sort(matrix, true)
        assertEquals(matrix, expectMatrix2)
    }

    @Test
    fun `Sort by max element`() {
        strategy = SortByMaxElement()
        val expectMatrix1 = Matrix(
            arrayOf(
                arrayOf(-1, 0, 0),
                arrayOf(2, 2, -2),
                arrayOf(2, 2, 3),
                arrayOf(5, 3, 4),
                arrayOf(20, 0, 1)
            )
        )
        val expectMatrix2 = Matrix(
            arrayOf(
                arrayOf(20, 0, 1),
                arrayOf(5, 3, 4),
                arrayOf(2, 2, 3),
                arrayOf(2, 2, -2),
                arrayOf(-1, 0, 0)
            )
        )

        strategy.sort(matrix, false)
        assertEquals(matrix, expectMatrix1)

        strategy.sort(matrix, true)
        assertEquals(matrix, expectMatrix2)
    }
}