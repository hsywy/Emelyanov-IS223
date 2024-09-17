//Практическая работа 4.5
//Емельянов Иван ИС223
fun main() {
    print("Введите число: ")
    val number = readLine()!!.toInt()

    val sign = when {
        number > 0 -> "Положительное"
        number < 0 -> "Отрицательное"
        else -> "Ноль"
    }

    println("Число $number является $sign")
}