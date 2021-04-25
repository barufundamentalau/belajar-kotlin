// main function
fun main() {
    val user = setUser("Candra", 29)
    println(user)

    printUser("Sukma")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}