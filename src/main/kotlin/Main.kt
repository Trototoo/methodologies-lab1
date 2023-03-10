import java.io.File
import java.lang.NumberFormatException

fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        val (a, b, c) = readABCNonInteractive(args)
        createEquationAndPrintRoots(a, b, c)
    } else {
        val (a, b, c) = readABCInteractive()
        createEquationAndPrintRoots(a, b, c)
    }
}

fun createEquationAndPrintRoots(a: Double, b: Double, c: Double) {
    val equation = QuadraticEquation(a, b, c)
    equation.printEquation()
    equation.printRoots()
}

private fun readNumber(string: String): Double {
    while (true) {
        print(string)
        val input = readln()
        try {
            return input.toDouble()
        } catch (e: NumberFormatException) {
            println("Error. Expected a valid real number, got $input instead")
        }
    }
}

private fun readABCInteractive(): Triple<Double, Double, Double> {
    var a: Double
    do {
        a = readNumber("a = ")
        if (a == 0.0) println("Error. A cannot be 0")
    } while (a == 0.0)

    val b = readNumber("b = ")

    val c = readNumber("c = ")
    return Triple(a, b, c)
}

private fun checkIfFileSuits(args: Array<String>): String {
    val filePath = args[0]
    val file = File(filePath)
    if (!(file.exists() && file.isFile)) {
        error("File $filePath does not exist")
    } else if (file.extension != "txt") {
        error("Invalid file format")
    }
    val fileContents = file.readText()
    val pattern = Regex("^-?(\\d+|\\d*\\.\\d+)\\s-?(\\d+|\\d*\\.\\d+)\\s-?(\\d+|\\d*\\.\\d+)\\r?\\n\$")
    if (!fileContents.matches(pattern)) {
        error("File doesn't match required pattern")
    }
    return fileContents
}

private fun readABCNonInteractive(args: Array<String>): Triple<Double, Double, Double> {
    val fileContents = checkIfFileSuits(args)
    val parts = fileContents.split("\\s+".toRegex())
    val a = parts[0].toDouble()
    if (a == 0.0) {
        error("Error. a cannot be 0")
    }
    val b = parts[1].toDouble()
    val c = parts[2].toDouble()
    return Triple(a, b, c)
}