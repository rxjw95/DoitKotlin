package ch3.function.functionalProgramming

fun main() {
    println("abc".getLongerString("1234asdf"));
    println(Person("woogie", 26).getMoreAge(Person("jee", 28)));
}

fun String.getLongerString(str: String): String {
    return if( this.length > str.length ) this else str
}

data class Person(val name: String, val age: Int) {}

fun Person.getMoreAge(person: Person): Person {
    return if(this.age > person.age) Person(person.name, person.age) else Person(person.name, person.age)
}

