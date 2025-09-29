fun main() {
    println("Enter a word:")
    val word = readLine() ?: ""
    if (word == word.reversed()) {
        println("Palindrome")
    } else {
        println("Not a palindrome")
    }
}
