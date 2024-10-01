//Практическая работа 9.5
//Емельянов Иван ИС223
fun main() {
    print("Enter the number to find prime numbers up to: ")
    val n = readLine()!!.toInt()

    val primeNumbers = mutableListOf<Int>()

    for (i in 2..n) {
        var isPrime = true

        for (j in 2 until i / 2 + 1) {
            if (i % j == 0) {
                isPrime = false
                break
            }
        }

        if (isPrime) {
            primeNumbers.add(i)
        }
    }

    println("Prime numbers up to $n: $primeNumbers")
}
