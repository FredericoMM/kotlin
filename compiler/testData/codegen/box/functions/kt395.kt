// IGNORE_BACKEND: WASM
fun Any.with(operation :  Any.() -> Any) = operation().toString()

val f = { a : Int -> }

fun box () : String {
    return if(20.with {
        this
    } == "20")
        "OK"
    else
        "fail"
}
