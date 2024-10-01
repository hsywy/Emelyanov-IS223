//Практическая работа 6.27
//Емельянов Иван ИС223
fun main() {
    val numbers = intArrayOf(1, 1, 2, 2, 2, 1, 1, 1, 3, 3, 3, 3, 3)
    val (maxSequenceLength, maxSequenceElement) = findMaxSequence(numbers)
    println("Максимальная последовательность: $maxSequenceElement, длина: $maxSequenceLength")
}

fun findMaxSequence(array: IntArray): Pair<Int, Int> {
    if (array.isEmpty()) {
        return Pair(0, 0)
    }
    var currentLength = 1
    var maxLength = 1
    var currentElement = array[0]
    var maxElement = array[0]
    for (i in 1 until array.size) {
        if (array[i] == array[i - 1]) {
            currentLength++
        } else {
            currentLength = 1
            currentElement = array[i]
        }
        if (currentLength > maxLength) {
            maxLength = currentLength
            maxElement = currentElement
        }
    }
    return Pair(maxLength, maxElement)
}