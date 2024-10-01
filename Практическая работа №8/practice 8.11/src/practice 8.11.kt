//Практическая работа 8.11
//Емельянов Иван ИС223
import javax.script.ScriptEngineManager

fun evaluateExpression(expression: String): Any? {
    val engine = ScriptEngineManager().getEngineByName("JavaScript")
    return engine.eval(expression)
}

fun main() {
    val equation = "1 + 1"
    val result = evaluateExpression(equation)
    println("Ответ уравнения '$equation' = $result")
}