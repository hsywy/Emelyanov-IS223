//Практическая работа 8.24
//Емельянов Иван ИС223
fun toUpperCase(text: String): String {
    return text.uppercase()
}

fun main() {
    val text = "hello, world!"
    val uppercaseText = toUpperCase(text)
    println("Текст в верхнем регистре: $uppercaseText")
}