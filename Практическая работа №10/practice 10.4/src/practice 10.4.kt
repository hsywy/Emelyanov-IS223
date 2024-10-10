//Практическая работа 10.4
//Емельянов Иван ИС223
fun fizzBuzz(n: Int): List<Any> {
    val result = mutableListOf<Any>()

    for (i in 1..n) {
        when {
            i % 3 == 0 && i % 5 == 0 -> result.add("ВизллБизлл")
            i % 3 == 0 -> result.add("Физллл")
            i % 5 == 0 -> result.add("Бизлллл")
            else -> result.add(i)
        }
    }

    return result
}

fun main() {
    println(fizzBuzz(5)) // [1, 2, " Физллл  ", 4, " Бизлллл "]
    println(fizzBuzz(16)) // [1, 2, " Физллл  ", 4, " Бизлллл ", " Физллл  ", 7, 8, " Физллл  ", " Бизлллл ", 11, " Физллл  ", 13, 14, " ВизллБизлл ", 16]
}
