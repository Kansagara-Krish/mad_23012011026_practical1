import java.io.File

fun safeReadFile(path : String): String {
    return try {
        path?.let { File(it).readText() } ?: "No file path provided."
    } catch (e: Exception) {
        "File could not be read."
    }
}
fun main(){
    val filePath = "src/p1.kt"
    val content = safeReadFile(filePath)
    println(content)
}