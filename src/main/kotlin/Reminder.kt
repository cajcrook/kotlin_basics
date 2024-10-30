
//class Reminder (
//    val name: String
//) {
//    fun name(name: String): String {
//        return name
//    }
//    fun remindMeTo(remindMeTo: String): String {
//        return remindMeTo
//    }
//    fun remind(name: String, remindMeTo: String): String {
//        return "$remindMeTo, $name"
//    }
//}
class Reminder(val name: String) {
    var reminderMessage: String = ""

    // Sets the reminder message
    fun remindMeTo(message: String) {
        reminderMessage = message
    }

    // Returns the formatted reminder message
    fun remind(): String {
        return "$reminderMessage, $name!"
    }
}





