fun main() {
    do {
        println("Choose stage (1):")
        val stage = readln()
        when (stage) {
            "1" -> stage1()
            else -> println("Not a valid choice.")
        }
    } while (stage != "1")
}