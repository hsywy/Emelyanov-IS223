//Практическая работа 9.3
//Емельянов Иван ИС223
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the amount to convert: ")
    val amount = scanner.nextDouble()

    print("Enter the currency to convert from (e.g. USD, EUR): ")
    val fromCurrency = scanner.next()

    print("Enter the currency to convert to (e.g. USD, EUR): ")
    val toCurrency = scanner.next()

    val conversionRate = when {
        fromCurrency == "USD" && toCurrency == "EUR" -> 0.85
        fromCurrency == "EUR" && toCurrency == "USD" -> 1.17
        else -> throw IllegalArgumentException("Unsupported currency conversion")
    }

    val convertedAmount = amount * conversionRate

    println("$amount $fromCurrency = $convertedAmount $toCurrency")
}
