//Практическая работа 8.22
//Емельянов Иван ИС223
fun isPalindrome(text: String): Boolean {
    val cleanText = text.lowercase().replace("\\s".toRegex(), "") // Удаляем пробелы и приводим к нижнему регистру
    return cleanText == cleanText.reversed()
}

fun main() {
    val text1 = "А роза упала на лапу Азора"
    val text2 = "Hello world"

    println("$text1 - палиндром: ${isPalindrome(text1)}")
    println("$text2 - палиндром: ${isPalindrome(text2)}")
}