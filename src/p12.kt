class Student(val name: String, val age: Int) {
    fun printInfo() {
        println("Name: $name, Age: $age")
    }
}

fun main() {
    val student = Student("John", 20)
    student.printInfo()
}
