fun main(args: Array<String>) {
    val numArray = doubleArrayOf(50.0, 67.5, -45.6, 20.34, 33.0, 45.6)
    var sum = 0.0

    for (num in numArray) {
        sum += num
    }

    val average = sum / numArray.size
    println("The average is: %.2f".format(average))
}