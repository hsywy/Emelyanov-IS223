//Практическая работа 6.23
//Емельянов Иван ИС223
fun main() {
    val numbers1 = intArrayOf(1, 2, 3)
    val numbers2 = intArrayOf(4, 5, 6)
    val numbers3 = intArrayOf(7, 8, 9)
    val mergedArray = mergeArrays(numbers1, numbers2, numbers3)
    println("Объединенный массив: ${mergedArray.contentToString()}")
}

fun mergeArrays(vararg arrays: IntArray): IntArray {
    val merged = IntArray(arrays.sumOf { it.size })
    var index = 0
    for (array in arrays) {
        for (i in array) {
            merged[index++] = i
        }
    }
    return merged
}