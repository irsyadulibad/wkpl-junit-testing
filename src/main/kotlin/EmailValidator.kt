object EmailValidator {
    fun isvalidEmail(email: String): Boolean {
        // Pattern untuk validasi alamat email
        // karakter sebelum "@" diikuti oleh "@",
        // domain dengan huruf, angka, "-", "."
        // dan TLD dengan minimal 2 karakter.
        val emailRegex = Regex("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\$");

        // Memeriksa apakah alamat email cocok dengan pola regex
        return emailRegex.matches(email);
    }
}