import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var num1: Double
    var num2: Double
    var result: Double

    print("Enter the first number: ")
    num1 = scanner.nextDouble()

    print("Enter the second number: ")
    num2 = scanner.nextDouble()

    print("Enter the operator (+, -, *, /): ")
    val operator = scanner.next()

    when (operator) {
        "+" -> result = num1 + num2
        "-" -> result = num1 - num2
        "*" -> result = num1 * num2
        "/" -> result = num1 / num2
        else -> {
            println("Invalid operator")
            return
        }
    }

    println("Result: $result")
}
