//Практическая работа 9.10
//Емельянов Иван ИС223
fun main() {
    val str = "Hello, world! This is a Kotlin program."

    val longestWord = findLongestWord(str)

    println("Longest word: $longestWord")
}

fun findLongestWord(str: String): String {
    var longestWord = ""
    var currentWord = ""

    for (char in str) {
        if (char.isLetterOrDigit()) {
            currentWord += char
        } else {
            if (currentWord.length > longestWord.length) {
                longestWord = currentWord
            }
            currentWord = ""
        }
    }

    if (currentWord.length > longestWord.length) {
        longestWord = currentWord
    }

    return longestWord
}
