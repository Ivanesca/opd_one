package task_1

class Matrix(data: Array<Array<Int>>) {

    val data: Array<Array<Int>> = data.clone()
    val row: Int = data.size
    val column: Int = data[0].size

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Matrix

        if (!data.contentDeepEquals(other.data)) return false
        if (row != other.row) return false
        if (column != other.column) return false

        return true
    }

    override fun hashCode(): Int {
        var result = data.contentDeepHashCode()
        result = 31 * result + row
        result = 31 * result + column
        return result
    }


}