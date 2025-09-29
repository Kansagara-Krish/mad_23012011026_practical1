fun main(){
    while (true){
        print("Enter a expression : ")
        val input = readLine() ?: break
        if (input == "exit") break

        val token = input.split(" ")

        var result = token[0].toDouble()
        var i = 1;
        while (i < token.size){
            val op = token[i]
            val num = token[i + 1].toDouble()
            result = when(op) {
                "+" -> result + num
                "-" -> result - num
                "*" -> result * num
                "/" -> result / num
                else -> {
                    println("Error: Unknown operator '$op'")
                    break
                }
            }
            i += 2
        }
        println("Result: $result")
    }
}