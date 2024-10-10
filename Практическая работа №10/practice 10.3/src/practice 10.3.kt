//Практическая работа 10.3
//Емельянов Иван ИС223
fun caesarCipher(input: String, key: Int): String {
    val encryptedText = StringBuilder()
    for (char in input) {
        // Проверить, является ли символ буквой
        if (char.isLetter()) {
            // Получить код символа
            var code = char.code

            // Применить смещение по ключу
            if (char.isUpperCase()) {
                code += key % 26
                if (code > 'Z'.code) code -= 26
            } else {
                code += key % 26
                if (code > 'z'.code) code -= 26
            }

            // Преобразовать код обратно в символ
            encryptedText.append(code.toChar())
        } else {
            // Небуквенные символы остаются неизменными
            encryptedText.append(char)
        }
    }

    return encryptedText.toString()
}

fun main() {
    val plaintext = "HELLOWORLD"
    val key = 3
    val ciphertext = caesarCipher(plaintext, key)

    println("Исходный текст: $plaintext")
    println("Зашифрованный текст: $ciphertext")
}
