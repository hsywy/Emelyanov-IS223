//Практическая работа 6.19
//Емельянов Иван ИС223
fun main() {
    val numbers1 = intArrayOf(1, 3, 5, 7, 9)
    val numbers2 = intArrayOf(2, 4, 6, 8, 10)
    val mergedArray = mergeSortedArrays(numbers1, numbers2)
    println("Объединенный отсортированный массив: ${mergedArray.contentToString()}")
}

fun mergeSortedArrays(arr1: IntArray, arr2: IntArray): IntArray {
    val merged = IntArray(arr1.size + arr2.size)
    var i = 0
    var j = 0
    var k = 0
    while (i < arr1.size && j < arr2.size) {
        if (arr1[i] < arr2[j]) {
            merged[k] = arr1[i]
            i++
        } else {
            merged[k] = arr2[j]
            j++
        }
        k++
    }
    while (i < arr1.size) {
        merged[k] = arr1[i]
        i++
        k++
    }
    while (j < arr2.size) {
        merged[k] = arr2[j]
        j++
        k++
    }
    return merged
}