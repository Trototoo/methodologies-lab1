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