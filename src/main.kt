fun main() {
    val str: String? = null
    print(str?.length) // null
    // print(str!!.length) // NPE
}