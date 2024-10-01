//Практическая работа 5.15
//Емельянов Иван ИС223
fun main() {
    print("Введите строку: ")
    val str = readLine()!!.toLowerCase()
    if (isPalindrome(str)) {
        println("Строка - палиндром")
    } else {
        println("Строка - не палиндром")
    }
}

fun isPalindrome(str: String): Boolean {
    return str == str.reversed()
}