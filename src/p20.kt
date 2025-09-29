data class User(var name: String, var age: Int)

fun main() {
    val user = User("Alice", 20).apply {
        age = 25
    }

    println(user)
}
