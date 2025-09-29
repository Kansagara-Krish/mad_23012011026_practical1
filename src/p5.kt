fun main() {
    val text = """
        Kotlin is simple. Kotlin is fun. Kotlin is powerful and simple.
    """.trimIndent()

    val words = text.lowercase().split(Regex("\\W+"))
    val freq = words.groupingBy { it }.eachCount()
    val sorted = freq.entries.sortedByDescending { it.value }

    println("Top 5 words:")
    sorted.take(5).forEach { println("${it.key}: ${it.value}") }
}
