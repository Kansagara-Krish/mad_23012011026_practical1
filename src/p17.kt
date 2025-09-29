class Box<T>(val content: T)

fun main() {
    val intBox = Box(123)
    val stringBox = Box("Hello")

    println(intBox.content)
    println(stringBox.content)
}
