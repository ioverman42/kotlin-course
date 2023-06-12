fun main(args: Array<String>) {
    println(getFortuneCookie())
}

fun getFortuneCookie() : String {
    var fortunes = listOf("They're watching you...", "Terrible, terrible shit is about to come your way",
            "Dead looks good on you", "You laugh now, wait until you get home", "Pick another fortune cookie")
    print("Enter your birthday: ")
    var userBirthday = readLine()
    var remainder = (userBirthday?.toIntOrNull() ?: 1) % 5
    return("Fortune: ${fortunes[remainder]}")
}