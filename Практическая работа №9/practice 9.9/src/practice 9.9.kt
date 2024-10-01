//Практическая работа 9.9
//Емельянов Иван ИС223
import java.util.*

fun main() {
    print("Enter the length of the password: ")
    val length = readLine()!!.toInt()

    val password = generatePassword(length)

    println("Generated password: $password")
}

fun generatePassword(length: Int): String {
    val chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+=-`~"
    val random = Random()

    val sb = StringBuilder()
    for (i in 1..length) {
        sb.append(chars[random.nextInt(chars.length)])
    }

    return sb.toString()
}
