import java.util.*

          fun main (args: Array<String>) {
              println("Hello ${args[0]}!")
              //dayOfWeek()
          }

          fun dayOfWeek() {
              println("What day of the week is it today?")
              val weekday = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
              println( when (weekday) {
                  1 -> "Today is Sunday"
                  2 -> "Today is Monday"
                  3 -> "Today is Tuesday"
                  4 -> "Today is Wednesday"
                  5 -> "Today is Thursday"
                  6 -> "Today is Friday"
                  7 -> "Today is Saturday"
                  else -> "Congratulations you have broken time"
              })
          }

