package ch3.function.functionalProgramming

fun main() {
    noParam { "람다식에 파라미터가 없으면 소괄호가 없이 사용할 수 없다." }
    // = noParam({ "람다식에 파라미터가 없으면 소괄호가 없이 사용할 수 없다." })

    oneParam { str -> "안녕하세요. ${str} 입니다."}
    oneParam { "안녕하세요. $it 입니다."}
    // = oneParam ({ str -> "안녕하세요. ${str} 입니다."})
    // = oneParam ( {"안녕하세요. $it 입니다."} )

    moreParam { name, age -> "안녕하세요. 제 이름은 ${name}이고, 나이는 ${age} 입니다." }
    // = moreParam({name, age -> "안녕하세요. 제 이름은 ${name}이고, 나이는 ${age} 입니다." });
    moreParam { _, age -> "안녕하세요. 이름은 생략하고 나이는 ${age} 입니다." }

    withArgs("jangwook") { name -> "안녕하세요. 제 이름은 ${name} 입니다." } // 다음과 같이 사용하기 위해선 람다식 매개변수가 마지막 매개변수로 위치해야 한다.
    // = withArgs("jangwook", { name -> "안녕하세요. 제 이름은 ${name} 입니다."})
}

fun noParam(foo: () -> String): Unit {
    println(foo())
}

fun oneParam(foo: (String) -> String): Unit {
    println(foo("woogie"))
}

fun moreParam(foo: (String, String) -> String): Unit {
    println(foo("woogie", "28"))
}

fun withArgs(name: String, foo: (String) -> String): Unit {
    println(foo(name))
}
