fun main() {
    println("Enter three numbers separated by space:")
    val numbers = readLine()?.split(" ")?.map { it.toInt() } ?: listOf()

    if (numbers.size < 3) {
        println("Invalid input")
        return
    }

    val largest = numbers.maxOrNull()
    println("Largest number: $largest")
}
