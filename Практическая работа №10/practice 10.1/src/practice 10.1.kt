//Практическая работа 10.1
//Емельянов Иван ИС223
fun printNumber(n: Int): List<Int> {
    if (n == 0) {
        return emptyList()
    }

    val list = mutableListOf<Int>()
    for (i in n downTo 1) {
        list.add(i)
    }

    return list
}

fun main() {
    println(printNumber(0)) // []
    println(printNumber(2)) // [2, 1]
    println(printNumber(5)) // [5, 4, 3, 2, 1]
}
