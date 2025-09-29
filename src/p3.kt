fun greet(name: String = "Guest", punctuation: Char = '!') {
    println("Hello, $name$punctuation")
}

fun main(args: Array<String>) {
    var name = "Guest"
    var punctuation = '!'

    for (i in args.indices) {
        when (args[i]) {
            "--name" -> name = args.getOrNull(i + 1) ?: "Guest"
            "--punctuation" -> punctuation = args.getOrNull(i + 1)?.firstOrNull() ?: '!'
        }
    }

    greet(name, punctuation)
}
