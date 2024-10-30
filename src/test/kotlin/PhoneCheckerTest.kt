import kotlin.test.Test

class PhoneCheckerTest {
    @Test
    fun testValidPhoneNumber() {
        val phone = PhoneChecker()
        assert(phone.isPhoneValid("07990735833"))
        assert(phone.isPhoneValid("07990735123"))
        assert(phone.isPhoneValid("08890735833"))
    }

    @Test
    fun testInValidPhoneNumber() {
        val phone = PhoneChecker()
//        assert(phone.isPhoneValid("079907358") == false)
        assert(!phone.isPhoneValid("079907358"))
    }
    @Test
    fun testInValidLetters() {
        val phone = PhoneChecker()
//        assert(phone.isPhoneValid("079907358") == false)
        assert(!phone.isPhoneValid("Chris"))
    }
}
