fun main() {
    print("Enter numbers separated by space: ")
    val nums = readLine()?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: listOf()

    var small = 0
    var medium = 0
    var large = 0

    for (n in nums) {
        when (n) {
            in 1..10 -> small++
            in 11..100 -> medium++
            else -> if (n >= 101) large++
        }
    }

    println("Small: $small, Medium: $medium, Large: $large")
}
