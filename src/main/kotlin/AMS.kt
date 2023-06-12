import java.util.*

fun main(args: Array<String>) {
    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday") //weekdays
    return week[Random().nextInt(7)] //gets random number 0-6 (up to not including 7), and returns associated weekday
}

fun fishFood(day : String) : String {
    //var food = "fasting"
    //when statements have a value, so you can do this \/
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "granules"
        "Thursday" -> "worms"
        "Friday" -> "mosquitoes"
        "Saturday" -> "plankton"
        "Sunday" -> "algae"
        else -> "nothing :("
    }
}


