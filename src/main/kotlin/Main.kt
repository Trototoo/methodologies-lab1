import java.io.File
import java.lang.NumberFormatException

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
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