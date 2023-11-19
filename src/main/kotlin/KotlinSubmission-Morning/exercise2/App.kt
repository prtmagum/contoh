package id.infinitelearning.KotlinSubmission.exercise2
import java.time.LocalDate
import java.time.Month
import java.time.format.TextStyle
import java.util.*

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
//     Buat di bawah sini
//    val evenNumbersList = mutableListOf<Int>()
//    for (nomor in 1..100) {
//        if (nomor % 2 == 0) {
//            evenNumbersList.add(nomor)
//
//        }}
//    println(evenNumbersList)}

    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    // Buat di bawah sini **/
//    val monthMap = mapOf("Jan" to "January","Feb" to "February","Mar" to "March","Apr" to "April","May" to "May","Jun" to "June","Jul" to "July","Aug" to "August","Sep" to "September","Oct" to "October","Nov" to "November","Dec" to "December")
//    // Menampilkan isi Map
//    println("Daftar nama bulan dalam setahun:")
//    for ((key, value) in monthMap) {
//    println("$key -> $value")
//    }
//    }

/** Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...
    // Buat di bawah sini **/
//    val monthMap = mapOf("Jan" to "January","Feb" to "February","Mar" to "March","Apr" to "April","May" to "May","Jun" to "June","Jul" to "July","Aug" to "August","Sep" to "September","Oct" to "October","Nov" to "November","Dec" to "December")
//    // Menampilkan isi Map
//    println("Daftar nama bulan dalam setahun:")
//        monthMap.forEach { (key, value) ->
//            println("$key -> $value")
//        }
//    }
   /** Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini **/
    val currentMonth = LocalDate.now().month
    val currentMonthName = currentMonth.getDisplayName(TextStyle.FULL, Locale.ENGLISH)
    val birthMonthIndex = 7
    val birthMonth = Month.of(birthMonthIndex)
    val birthMonthName = birthMonth.getDisplayName(TextStyle.FULL, Locale.ENGLISH)

    // Mencetak nama bulan sekarang dan bulan lahir dengan format string
    println("It's $currentMonthName now, I was born in $birthMonthName")}


