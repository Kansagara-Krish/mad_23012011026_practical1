sealed class Result
class Success(val message: String) : Result()
class Error(val message: String) : Result()

fun printResult(result: Result) {
    when (result) {
        is Success -> println("Success: ${result.message}")
        is Error -> println("Error: ${result.message}")
    }
}

fun main() {
    val res1 = Success("Operation completed")
    val res2 = Error("Something went wrong")

    printResult(res1)
    printResult(res2)
}
