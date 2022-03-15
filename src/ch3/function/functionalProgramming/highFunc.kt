package ch3.function.functionalProgramming

fun main() {
    println(highFunc({ x, y -> x + y}, 3, 5))  // 함수의 인자로 함수를 전달

    // 변수에 람다식 함수 할당하기
    val multi: (Int, Int) -> Int = { x, y -> x * y }
    println(multi(3, 3)) // result: 9

    // 변수에 파라미터없이 함수 할당하기
    val log: () -> Unit = { println("logged.") }

    // 람다식이 두 줄 이상인 경우
    val multiAndPrint: (Int, Int) -> Int = { x, y ->
        println(x * y)
        x * y // 마지막 줄이 return 값이 된다.
    }

    // 람다식 함수 복사
    val copyOfMultiAndPrint = multiAndPrint
    copyOfMultiAndPrint(3, 4)
}

fun highFunc(sum: (Int, Int) -> Int, a: Int, b: Int) :Int {
    return sum(a, b) // 파라미터로 전달 받은 함수를 그대로 사용
}


