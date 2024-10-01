//Практическая работа 6.15
//Емельянов Иван ИС223
fun main() {
    val numbers = intArrayOf(1, 2, 3, 2, 1)
    if (isPalindrome(numbers)) {
        println("Массив - палиндром")
    } else {
        println("Массив - не палиндром")
    }
}

fun isPalindrome(array: IntArray): Boolean {
    for (i in 0 until array.size / 2) {
        if (array[i] != array[array.size - i - 1]) {
            return false
        }
    }
    return true
}