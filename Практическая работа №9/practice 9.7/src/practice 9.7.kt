//Практическая работа 9.7
//Емельянов Иван ИС223
fun main() {
    print("Enter a string: ")
    val str = readLine()!!

    println("Original string: $str")
    println("Reversed case string: ${str.reversedCase()}")
}

fun String.reversedCase(): String {
    val sb = StringBuilder()

    for (char in this) {
        sb.append(if (char.isUpperCase()) char.toLowerCase() else char.toUpperCase())
    }

    return sb.toString()
}
