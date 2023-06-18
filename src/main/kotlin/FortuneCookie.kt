fun main(args: Array<String>) {
    println(getFortuneCookie(getBirthday()))
}

fun getFortuneCookie(userBirthday : Int) : String {
    var fortunes = listOf("They're watching you...", "Terrible, terrible shit is about to come your way",
            "Dead looks good on you", "You laugh now, wait until you get home", "Pick another fortune cookie")
    val pattern = "0229....".toRegex() //using Regex here could result in some cool shit e.g. any Feb 29th birthday...
    val remainder = (userBirthday) % 5
    return when (userBirthday) {
                        10301998 -> "Fortune: Hey, Isabel! You're the best!"
                        else -> "Fortune: ${fortunes[remainder]}"
                    }
}

fun getBirthday() : Int {
    print("Enter your birthday [MMDDYYYY]: ")
    return readLine()?.toIntOrNull() ?: 1
}

/* //Here's another way to do this
fun main(args: Array<String>) {
    var fortune: String for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}
*/
