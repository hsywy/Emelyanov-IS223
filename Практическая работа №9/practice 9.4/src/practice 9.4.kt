//Практическая работа 9.4
//Емельянов Иван ИС223
fun main() {
    val str1 = "hello"
    val str2 = "olleh"

    println(isAnagram(str1, str2)) // true
}

fun isAnagram(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) {
        return false
    }

    val charCount = IntArray(256)

    for (char in str1) {
        charCount[char.toInt()]++
    }

    for (char in str2) {
        charCount[char.toInt()]--
        if (charCount[char.toInt()] < 0) {
            return false
        }
    }

    return true
}
