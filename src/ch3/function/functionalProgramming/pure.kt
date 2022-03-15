package ch3.function.functionalProgramming

fun main() {
    sum(1, 2);
    sum(1, 2);
    sum(1, 2);
}
//pure
fun sum(a: Int, b: Int): Int {
    return a + b
}

//not pure
//fun process(user: User): Unit {
//    val grade = user.getGrade()
//    if(grade != null) user.register(grade)
//}

// lambda: { x, y -> x + y }