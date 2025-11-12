import java.util.Scanner

val legalOperators = arrayOf("+","-","*","/")

fun validateCalc(a: Int, b: Int, op: Int) {
    if (op == -1) print("This operator does not exist $op")

    if (op == 0) {
        println(a + b)
    }
    else if (op == 1) {
        println(a - b)
    }
    else if (op == 2) {
        println(a * b)
    }
    else if (op == 3) {
        if (b != 0) {
            println(a / b)
        }
        else {
            print("Division by Zero!")
        }

    }
}

fun getUserInputs(): Array<Int> {
    // returns the user input for A, B & OP
    // If OP does not exist, it returns -1 on index 2
    // No Error-check for no integer input
    println("A:")
    val numa = Scanner(System.`in`)
    val a: Int = numa.nextInt()

    println("OP:")
    val strop = Scanner(System.`in`)
    val op: String = strop.nextLine()

    println("B:")
    val numb = Scanner(System.`in`)
    val b: Int = numb.nextInt()

    numa.close()
    numb.close()
    strop.close()

    if (!legalOperators.contains(op)) return arrayOf(a,b,-1)
    var numOp = 0
    for (lo in legalOperators) {
        if (lo == op) break
        numOp++
    }
    return arrayOf(a, b, numOp)
}

fun main() {
    val result = getUserInputs()
    validateCalc(result[0],result[1],result[2])
}