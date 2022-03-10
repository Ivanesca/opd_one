package task_1

class Matrix(data: Array<Array<Int>>) {

    val data: Array<Array<Int>> = data.clone()
    val row: Int = data.size
    val column: Int = data[0].size

}