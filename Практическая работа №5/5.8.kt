//Практическая работа 5.8
//Емельянов Иван ИС223
fun main(){
    print("введите первое число ")
    val num1 = readLine()!!.toInt()
    print("введите второе число ")
    val num2 = readLine()!!.toInt()
    println("НОД($num1, $num2) = ${gcd(num1,num2)}")
}
fun gcd(a: int, b: int): int {
    if (b == 0){
        return a
    }
    return gcd(b, a % b)
}

class int {

}

