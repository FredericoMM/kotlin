// IGNORE_BACKEND: WASM
val c = Unit
val d = c

fun box(): String {
    c
    d
    return "OK"
}
