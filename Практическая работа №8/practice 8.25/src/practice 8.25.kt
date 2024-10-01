//Практическая работа 8.25
//Емельянов Иван ИС223
fun combineStrings(str1: String, str2: String): String {
    return str1 + str2
}

fun main() {
    val str1 = "Привет"
    val str2 = " мир!"
    val combinedString = combineStrings(str1, str2)
    println("Объединенная строка: $combinedString")
}