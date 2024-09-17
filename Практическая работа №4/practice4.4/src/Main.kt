//Практическая работа 4.4
//Емельянов Иван ИС223
fun main() {
    print("Введите часы (0-23): ")
    val hours = readLine()!!.toInt()
    print("Введите минуты (0-59): ")
    val minutes = readLine()!!.toInt()

    if (hours !in 0..23 || minutes !in 0..59) {
        println("Некорректное время. Введите часы от 0 до 23 и минуты от 0 до 59.")
    }

    val timeOfDay = when {
        hours in 5..11 -> "Утро"
        hours in 12..17 -> "День"
        hours in 18..20 -> "Вечер"
        else -> "Ночь"
    }

    println("Время суток: $timeOfDay")
}