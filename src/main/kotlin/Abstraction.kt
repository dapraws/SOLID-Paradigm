abstract class DataFetcher {
    // Data dijadikan properti yang diimplementasi oleh subclass
    protected val dataList = mutableListOf<Any>()
    // Fungsi abstrak untuk mengambil data yang harus diimplementasikan oleh subclass
    protected abstract fun fetchData()
    // Fungsi untuk mengatur data, akan memanggil fetchData()
    fun setData() {
        fetchData()
    }
    // Fungsi untuk mendapatkan data
    fun getData() = dataList
}

class NetworkDataFetcher : DataFetcher() {
    override fun fetchData() {
        // Misalnya logika pengambilan data dari jaringan dilakukan di sini
        // Sebagai contoh, kita hanya membuat data palsu di sini
        val fakeData = listOf("Data 1", "Data 2", "Data 3")
        dataList.clear()
        dataList.addAll(fakeData)
    }
}

fun main() {
    val dataFetcher = NetworkDataFetcher()
    dataFetcher.setData()
    val data = dataFetcher.getData()
    println("Data retrieved: $data")
}
