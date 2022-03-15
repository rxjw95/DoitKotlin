package ch3.function.functionalProgramming

import kotlin.random.Random

fun main() {
    val random:() -> Int = { Random.nextInt(10) }

    callByValue(random());
    callByName(random);
    println(methodReference(::multi, 3, 4))
}

fun callByValue(value: Int): Int {
    println(value)
    return value
}

fun callByName(value: () -> Int): Int {
    println(value())
    return value()
}

fun methodReference(mul: (Int, Int) -> Int, a: Int, b: Int): Int {
    return mul(a, b)
}

fun multi(a: Int, b: Int): Int {
    return a * b;
}