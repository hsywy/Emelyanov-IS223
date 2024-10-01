//Практическая работа 8.12
//Емельянов Иван ИС223
fun generateGoogle(number: Int): String {
    val oCount = if (number < 0) 0 else number // Проверка на отрицательные числа
    return "G${"o".repeat(oCount)}gle"
}

fun main() {
    val number = 3 // Замените это значение на нужное вам
    val result = generateGoogle(number)
    println(result)
}