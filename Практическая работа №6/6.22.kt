//Практическая работа 6.22
//Емельянов Иван ИС223
fun main() {
    val numbers = intArrayOf(10, 5, 20, 15, 30, 25, 1, 18, 2, 9)
    val secondMax = findSecondMax(numbers)
    println("Второй по величине элемент: $secondMax")
}

fun findSecondMax(array: IntArray): Int {
    if (array.size < 2) {
        return -1 // Или любое другое значение, означающее ошибку
    }
    var max = array[0]
    var secondMax = Int.MIN_VALUE
    for (i in 1 until array.size) {
        if (array[i] > max) {
            secondMax = max
            max = array[i]
        } else if (array[i] > secondMax && array[i] != max) {
            secondMax = array[i]
        }
    }
    if (secondMax == Int.MIN_VALUE) {
        return -1 // Или любое другое значение, означающее ошибку
    }
    return secondMax
}