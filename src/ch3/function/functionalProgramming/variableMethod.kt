package ch3.function.functionalProgramming

fun main() {
    val anonymousFunc = fun():String {
        print("this is anonymous function.")
        return "anonymous"
    }
    anonymousFunc()

    sumInline()  // 분기하지 않고 sumInline 내부 코드가 그대로 main으로 복사된다.
    sumInline()

    complexFuncNoInline({ print("simple code") }, { print("complex code") })

    nonLocalReturnFunc(5) {
        println("$it nonLocalReturnFunc arg")
        return
    }

    crossinlineFunc(3) {
        println("$it can't return")
    }
}

inline fun crossinlineFunc(arg: Int, crossinline func: (Int) -> Unit) {
    println("func start")
    func(arg)
    println("func end")
}

inline fun sumInline(vararg nums: Int): Int {
    return nums.sum()
}

inline fun complexFuncNoInline(simple:() -> Unit, noinline complex: () -> Unit) {
    print("start")
    simple() // 간단한 코드
    complex() // 복잡한 코드
    print("end")
}

inline fun nonLocalReturnFunc(arg: Int, func: (Int) -> Unit) {
    println("func start")
    func(arg)
    println("func end")
}
