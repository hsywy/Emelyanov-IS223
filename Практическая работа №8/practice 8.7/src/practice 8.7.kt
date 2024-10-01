//Практическая работа 8.7
//Емельянов Иван ИС223
fun isDivisibleBy100(number: Int): Boolean {
    return number % 100 == 0
}

fun main() {
    val number = 250
    val result = isDivisibleBy100(number)
    println("Число $number делится на 100: $result")
}