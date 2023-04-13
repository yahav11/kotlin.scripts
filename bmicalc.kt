import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var weight: Double
    var height: Double
    var bmi: Double

    print("Enter your weight in kilograms: ")
    weight = scanner.nextDouble()

    print("Enter your height in meters: ")
    height = scanner.nextDouble()

    bmi = weight / (height * height)

    println("Your BMI is: $bmi")

    val category = when {
        bmi < 18.5 -> "Underweight"
        bmi >= 18.5 && bmi < 24.9 -> "Normal weight"
        bmi >= 25 && bmi < 29.9 -> "Overweight"
        bmi >= 30 -> "Obese"
        else -> "Unknown"
    }

    println("Category: $category")
}
