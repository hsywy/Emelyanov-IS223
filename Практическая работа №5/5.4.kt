//Практическая работа 5.4
//Емельянов Иван ИС223
fun main() {
    print("Введите число: ")
    val num = readLine()!!.toInt()
    var factorial = 1
    for (i in 1..num) {
        factorial *= i
    }
    println("Факториал числа: $factorial")
}
