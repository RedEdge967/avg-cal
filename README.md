# avg-cal
- This program can calculate average of numbers you input.

## Needed
- A program to run `.kt` with compiler
- or a online kotlin compiler and output

## How to?
- Download the `avg cal.kt` and run it.
- or copy the code and paste it on a online compiler and run.
- when changing the numbers,
```kotlin
val numArray = doubleArrayOf(50.0, 67.5, -45.6, 20.34, 33.0, 45.6)
```
put your numbers except those numbers (code will come up with this numbers.)
> #### 🛑 Note: When changing numbers, remember to use decimal number. if you wanna put 50, put it as `50.0`

### Full code
```kotlin
fun main(args: Array<String>) {
    val numArray = doubleArrayOf(50.0, 67.5, -45.6, 20.34, 33.0, 45.6)
    var sum = 0.0

    for (num in numArray) {
        sum += num
    }

    val average = sum / numArray.size
    println("The average is: %.2f".format(average))
}
```
> ### If you used this and got it as helpful, remember to give a star :star2:
