//Практическая работа 5.21
//Емельянов Иван ИС223
fun main() {
    print("Введите год: ")
    val year = readLine()!!.toInt()
    print("Введите месяц: ")
    val month = readLine()!!.toInt()
    val daysInMonth = when (month) {
        2 -> if (isLeapYear(year)) 29 else 28
        4, 6, 9, 11 -> 30
        else -> 31
    }
    println("Даты в $month месяце $year года:")
    for (day in 1..daysInMonth) {
        println("$year-$month-${String.format("%02d", day)}")
    }
}

fun isLeapYear(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
}