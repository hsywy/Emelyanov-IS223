//Практическая работа 6.25
//Емельянов Иван ИС223
fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    print("Введите число для поиска: ")
    val searchNum = readLine()!!.toInt()
    if (linearSearch(numbers, searchNum)) {
        println("Элемент $searchNum найден в массиве")
    } else {
        println("Элемент $searchNum не найден в массиве")
    }
}

fun linearSearch(array: IntArray, element: Int): Boolean {
    for (i in array.indices) {
        if (array[i] == element) {
            return true
        }
    }
    return false
}