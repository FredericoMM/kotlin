// IGNORE_BACKEND: WASM
enum class En {
    A,
    B
}

fun box(): String {
    when(En.A) {
        En.A -> "s1"
        En.B -> "s2"
    }
    return "OK"
}