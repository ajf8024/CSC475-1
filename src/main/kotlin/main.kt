fun main() {
    CT1()
}

fun CT1() {
    println("Simple Calculator")
    while (true) {
        println("Choose operation: +, -, *, / or type 'exit' to quit")
        val input = readLine()!!
        if (input == "exit") break
        println("Enter first number:")
        val num1 = readLine()!!.toDouble()
        println("Enter second number:")
        val num2 = readLine()!!.toDouble()

        when (input) {
            "+" -> println("Result: ${add(num1, num2)}")
            "-" -> println("Result: ${subtract(num1, num2)}")
            "*" -> println("Result: ${multiply(num1, num2)}")
            "/" -> println("Result: ${divide(num1, num2)}")
            else -> println("Invalid operation")
        }
    }
}

fun add(a: Double, b: Double): Double = a + b
fun subtract(a: Double, b: Double): Double = a - b
fun multiply(a: Double, b: Double): Double = a * b
fun divide(a: Double, b: Double): Double {
    if (b == 0.0) {
        println("Error: Division by zero")
        return Double.NaN
    }
    return a / b
}
