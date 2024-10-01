//Практическая работа 5.24
//Емельянов Иван ИС223
fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    println("Исходная матрица:")
    printMatrix(matrix)
    val transposedMatrix = transpose(matrix)
    println("Транспонированная матрица:")
    printMatrix(transposedMatrix)
}

fun transpose(matrix: Array<IntArray>): Array<IntArray> {
    val rows = matrix.size
    val cols = matrix[0].size
    val transposed = Array(cols) { IntArray(rows) }
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            transposed[j][i] = matrix[i][j]
        }
    }
    return transposed
}

fun printMatrix(matrix: Array<IntArray>) {
    for (i in 0 until matrix.size) {
        for (j in 0 until matrix[i].size) {
            print("${matrix[i][j]}\t")
        }
        println()
    }
}