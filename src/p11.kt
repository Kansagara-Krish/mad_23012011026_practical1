fun main() {
    val numbers = (1..5).toList()
    val squares = numbers.map { it * it }
    println(squares)
}
