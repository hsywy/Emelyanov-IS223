//Практическая работа 9.2
//Емельянов Иван ИС223
fun main() {
    print("Enter a string: ")
    val str = readLine()!!

    var vowels = 0
    var consonants = 0

    for (char in str) {
        when (char.toLowerCase()) {
            'a', 'e', 'i', 'o', 'u' -> vowels++
            in 'a'..'z' -> consonants++
        }
    }

    println("Vowels: $vowels")
    println("Consonants: $consonants")
}
