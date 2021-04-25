// main function
fun main() {
    val storeOpen = 7
    val now = 20
    val store: String
    store = if (now > storeOpen) {
        "Store already open"
    } else {
        "Store is closed"
    }

    print(store)
}