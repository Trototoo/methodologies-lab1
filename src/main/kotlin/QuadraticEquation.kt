import kotlin.math.sqrt

class QuadraticEquation(val a: Double, val b: Double, val c: Double) {
    private val discriminant = b * b - 4 * a * c

    var x1: Double? = if (discriminant >= 0) (-b + sqrt(discriminant)) / (2 * a) else null
    var x2: Double? = if (discriminant >= 0) (-b - sqrt(discriminant)) / (2 * a) else null

    fun printEquation() {
        println("Equation is: (${a}) x^2 + (${b}) x + (${c}) = 0")
    }

    fun printRoots() {
        if (discriminant > 0.0) {
            println("There are 2 roots")
            println(String.format("x1 = %.3f \nx2 = %.3f", x1, x2))
        } else if (discriminant == 0.0) {
            println("There is 1 root")
            println("x = ${String.format("%.3f", x1)}")
        } else {
            println("There are 0 roots")
        }
    }
}