package id.infinitelearning.KotlinSubmission.exercise4
import java.io.FileInputStream
import java.io.IOException

fun main() {
    try {
        // Input data umur
        println("Masukkan umur Anda:")
        val userInput = readLine()

        // Mencoba mengonversi input ke dalam tipe data Int
        val age = userInput?.toInt()

        // Menampilkan umur jika konversi berhasil
        println("Umur Anda: $age tahun")

    } catch (e: NumberFormatException) {
        // jika terjadi kesalan 1
        println("Maaf, input yang dimasukkan bukan angka yang valid.")

    } catch (e: Exception) {
        // jika terjadi kesalahan 2
        println("Terjadi kesalahan: ${e.message}")

    } finally {
        // Pesan terakhir
        println("Terima kasih sudah menggunakan program ini.")
    }
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

