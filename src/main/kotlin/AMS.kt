import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]}!")

    feedTheFish()


    //dayOfWeek()

    //timeGreeting("12")
    //suggested way of doing timeGreeting on the main()
    /*
    if (args[0].toInt() < 12) println("Good morning")
    else println("Good night" )
     */
}

fun feedTheFish() {
    val day = randomDay()
    val food = "pellets"
    println("Today is $day and the fish eat $food")
}

fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday") //weekdays
    return week[Random().nextInt(7)] //gets random number 0-6 (up to not including 7), and returns associated weekday
}




fun dayOfWeek() {
    println("What day of the week is it today?")
    val weekday = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(
        when (weekday) {
            1 -> "Today is Sunday"
            2 -> "Today is Monday"
            3 -> "Today is Tuesday"
            4 -> "Today is Wednesday"
            5 -> "Today is Thursday"
            6 -> "Today is Friday"
            7 -> "Today is Saturday"
            else -> "Congratulations you have broken time"
        }
    )
}

fun timeGreeting(hour: String) {
    if (hour.toInt() < 12) {
        println("Good morning")
    } else if (hour.toInt() >= 12) {
        println("Good evening")
    }
}
