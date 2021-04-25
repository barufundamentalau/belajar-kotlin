// main function
fun main() {
    val storeOpen = 7
    val now = 20
    val office: String
    if (now < storeOpen) {
        office = "Store already open"
    } else {
        office = "Store is closed"
    }

    print(office)
}