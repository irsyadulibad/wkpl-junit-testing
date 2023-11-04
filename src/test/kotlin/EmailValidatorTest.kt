import com.google.common.truth.Truth
import org.junit.jupiter.api.Test

class EmailValidatorTest {
    // Test untuk memastikan apakah email validator berfungsi
    // Validator harus mengembalikan nilai true
    // Jika email yang diberikan valid
    @Test
    fun correctEmailReturnTrue() {
        val email = "ahmadirsyadulibad7@gmail.com";
        Truth.assertThat(EmailValidator.isvalidEmail(email)).isTrue()
    }
}