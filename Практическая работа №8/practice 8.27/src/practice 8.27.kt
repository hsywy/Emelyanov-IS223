//Практическая работа 8.27
//Емельянов Иван ИС223
fun containsElement(array: IntArray, element: Int): Boolean {
    for (item in array) {
        if (item == element) {
            return true
        }
    }
    return false
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val elementToFind = 3

    if (containsElement(numbers, elementToFind)) {
        println("Элемент $elementToFind присутствует в массиве.")
    } else {
        println("Элемент $elementToFind отсутствует в массиве.")
    }
}