fun main() {
    var any:Any = 12.2f // 스마트 캐스팅

    if(any is Int) {
        print("Int")
    } else if(any is Float) {
        print("Float") // 해당 분기를 탄다.
    } else if(any is Double) {
        print("Double")
    }
}