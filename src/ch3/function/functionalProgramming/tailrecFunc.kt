package ch3.function.functionalProgramming

import java.math.BigInteger


fun main() {
    println(factorial(3))
    println(factorialTailrec(BigInteger("100")))
}

fun factorial(n: Int): Long {
    return if(n == 1)  n.toLong()  else n * factorial(n - 1)
}

tailrec fun factorialTailrec(n: BigInteger, run: BigInteger = BigInteger("1")): BigInteger {
    return if(n.toString(10).equals("1"))  run else factorialTailrec(n.subtract(BigInteger("1")), run * n)
}