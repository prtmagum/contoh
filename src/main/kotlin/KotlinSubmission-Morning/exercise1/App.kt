package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    var nadep: String = "Agum"
    var nabel: String = "Pratama"
    var umur: Int = 21
    val single: Boolean = true


    println("Nama depan : " + nadep)
    println("Nama belakang : " + nabel)
    println("Umur : " + umur)
    if (single) {
        println("Status: Single")
    } else {
        println("Status: Tidak Single")
    }
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {

    val groupId = "4"
    val groupMembers = listOf("Agum Pratama","M.Rizko Sefta","Rizky Zakaria Rani","Mira Mulyani","Frida Nurul Azizah")
    val session = "Mobile Morning A"

    println("Group ID : "+groupId)
    println("Group Members : "+groupMembers)
    println("Session : "+session)
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {

    val anggota = listOf("Agum Pratama","M.Rizko Sefta","Rizky Zakaria Rani","Mira Mulyani","Frida Nurul Azizah")
    return anggota
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Hasan Albana", "Kak Yogi")
    val countOfGroup = arrayOf<String>("Agum Pratama","M.Rizko Sefta","Rizky Zakaria Rani","Mira Mulyani","Frida Nurul Azizah")
    return mentor.size + countOfGroup.size


    return 0
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("4", listOf(myTeam), "Mobile Morning A")

}