// Definisi class Produk
class Produk(
    val nama: String,
    var harga: Double,
    var stok: Int,
    val kategori: String,
    val berat: Double,
    val deskripsi: String
) {
    // Fungsi untuk menampilkan informasi detail produk
    fun tampilkanInfoProduk() {
        println("Nama Produk   : $nama")
        println("Kategori      : $kategori")
        println("Berat         : $berat kg")
        println("Deskripsi     : $deskripsi")
        println("Harga         : Rp. $harga")
        println("Stok Tersedia : $stok")
        println("------------------------------")
    }

    // Fungsi untuk membeli produk (mengurangi stok)
    fun beliProduk(jumlah: Int) {
        if (jumlah > stok) {
            println("Maaf, stok tidak mencukupi. Stok tersisa hanya $stok.")
        } else {
            stok -= jumlah
            println("Anda telah membeli $jumlah $nama.")
            println("Stok tersisa: $stok")
        }
    }
}

// Fungsi main untuk membuat objek dan simulasi pembelian
fun main() {
    // Membuat objek Produk
    val produk1 = Produk(
        nama = "MacBook Air",
        harga = 20000000.0,
        stok = 5,
        kategori = "Elektronik",
        berat = 1.29,
        deskripsi = "Laptop tipis dan ringan dengan performa tinggi dari Apple."
    )

    // Menampilkan informasi produk
    produk1.tampilkanInfoProduk()

    // Melakukan simulasi pembelian produk
    produk1.beliProduk(2) // Membeli 2 unit produk
    produk1.tampilkanInfoProduk() // Menampilkan info produk setelah pembelian
}
