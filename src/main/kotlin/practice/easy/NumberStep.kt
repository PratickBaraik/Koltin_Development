package practice.easy
fun main() {
    print("Enter the start: ")
    val start = readlnOrNull()?.toIntOrNull()
    println("Start = $start")

    print("Enter the limit: ")
    val limit = readlnOrNull()?.toIntOrNull()
    println("Limit = $limit")

    print("Enter the steps: ")
    val step = readlnOrNull()?.toIntOrNull()
    println("Steps = $step")

    // printing the number till the range by skipping for give steps
    if (start == null || limit == null || step == null) {
        println("Please enter some valid inputs!")
    } else {
        for(i in start..limit step step) {
            println("I = $i")        }
    }
}