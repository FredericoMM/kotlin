// IGNORE_BACKEND: WASM
// Auto-generated by GeneratePrimitiveVsObjectEqualityTestData. Do not edit!

val nx: Int? = 0
val nn: Int? = null
val x: Int = 0
val y: Int = 1

fun box(): String {
    val ax: Int? = 0
    val an: Int? = null
    val bx: Int = 0
    val by: Int = 1

    return when {
        0 != nx -> "Fail 0"
        1 == nx -> "Fail 1"
        !(0 == nx) -> "Fail 2"
        !(1 != nx) -> "Fail 3"
        x != nx -> "Fail 4"
        y == nx -> "Fail 5"
        !(x == nx) -> "Fail 6"
        !(y != nx) -> "Fail 7"
        0 == nn -> "Fail 8"
        !(0 != nn) -> "Fail 9"
        x == nn -> "Fail 10"
        !(x != nn) -> "Fail 11"
        0 != ax -> "Fail 12"
        1 == ax -> "Fail 13"
        !(0 == ax) -> "Fail 14"
        !(1 != ax) -> "Fail 15"
        x != ax -> "Fail 16"
        y == ax -> "Fail 17"
        !(x == ax) -> "Fail 18"
        !(y != ax) -> "Fail 19"
        bx != ax -> "Fail 20"
        by == ax -> "Fail 21"
        !(bx == ax) -> "Fail 22"
        !(by != ax) -> "Fail 23"
        0 == an -> "Fail 24"
        !(0 != an) -> "Fail 25"
        x == an -> "Fail 26"
        !(x != an) -> "Fail 27"
        bx == an -> "Fail 28"
        !(bx != an) -> "Fail 29"
        else -> "OK"
    }
}
