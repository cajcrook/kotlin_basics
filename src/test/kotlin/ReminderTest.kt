import kotlin.test.Test

//class ReminderTest {

//    @Test
//    fun testReminder() {
//        val reminder = Reminder("Chris")
//        assert(reminder.name("Chris") == "Chris")
//        assert(reminder.remindMeTo("Go for a bike ride")
//                == "Go for a bike ride")
//        assert(reminder.remind("Chris", "Go for a bike ride")
//                == "Go for a bike ride, Chris")
//    }

import kotlin.test.assertEquals

class ReminderTest {

    @Test
    fun testReminder() {
        val reminder = Reminder("Leo")
        reminder.remindMeTo("Walk the dog")
        assertEquals("Walk the dog, Leo!", reminder.remind())

        val reminder2 = Reminder("Ju")
        reminder2.remindMeTo("Buy popcorn")
        assertEquals("Buy popcorn, Ju!", reminder2.remind())
    }
}


