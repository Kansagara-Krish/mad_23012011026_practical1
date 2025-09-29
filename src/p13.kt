open class Animal {
    open fun sound() = println("Some sound")
}

class Dog : Animal() {
    override fun sound() = println("Woof!")
}

class Cat : Animal() {
    override fun sound() = println("Meow!")
}

fun main() {
    val dog = Dog()
    val cat = Cat()
    dog.sound()
    cat.sound()
}
