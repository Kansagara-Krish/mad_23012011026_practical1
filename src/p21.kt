open class Matrix(val rows: Int, val cols: Int, val elements: Array<IntArray>) {

    constructor(rows: Int, cols: Int) : this(rows, cols, Array(rows) { IntArray(cols) { 0 } })

    fun addMatrix(other: Matrix): Matrix {
        val result = Matrix(rows, cols)
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result.elements[i][j] = this.elements[i][j] + other.elements[i][j]
            }
        }
        return result
    }

    fun subtractMatrix(other: Matrix): Matrix {
        val result = Matrix(rows, cols)
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result.elements[i][j] = this.elements[i][j] - other.elements[i][j]
            }
        }
        return result
    }

    fun multiplyMatrix(other: Matrix): Matrix {
        val result = Matrix(rows, other.cols)
        for (i in 0 until rows) {
            for (j in 0 until other.cols) {
                for (k in 0 until cols) {
                    result.elements[i][j] += this.elements[i][k] * other.elements[k][j]
                }
            }
        }
        return result
    }

    fun displayMatrix() {
        for (row in elements) {
            println(row.joinToString(" "))
        }
    }

    override fun toString(): String {
        return elements.joinToString("\n") { it.joinToString(" ") }
    }
}

class SquareMatrix(val order: Int, elements: Array<IntArray>) : Matrix(order, order, elements) {

    constructor(order: Int) : this(order, Array(order) { i -> IntArray(order) { j -> if (i == j) 1 else 0 } })
}

fun main() {
    val m1 = Matrix(2, 2, arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)))
    val m2 = Matrix(2, 2, arrayOf(intArrayOf(5, 6), intArrayOf(7, 8)))

    println("Matrix Addition:")
    m1.addMatrix(m2).displayMatrix()

    println("\nSquare Matrix (Identity):")
    val sm = SquareMatrix(3)
    sm.displayMatrix()
}
