class DataRepository {
    private val data = mutableListOf<Any>()

    fun setData() {
        val response = retrieveDataFromNetwork() // Misalnya ini adalah kode logika yang mendapatkan data dari jaringan
        data.clear()
        data.addAll(response.data)
    }

    fun getData() = data

    // Fungsi palsu untuk simulasi pengambilan data dari jaringan
    private fun retrieveDataFromNetwork(): NetworkResponse {
        // Misalnya logika pengambilan data dari jaringan dilakukan di sini
        // Sebagai contoh, kita hanya membuat data palsu di sini
        val fakeData = listOf("Data 1", "Data 2", "Data 3")
        return NetworkResponse(fakeData)
    }

    // Kelas untuk menyimpan respon data jaringan
    private data class NetworkResponse(val data: List<Any>)
}

fun main() {
    val repository = DataRepository()
    repository.setData()
    val data = repository.getData()
    println("Data retrieved: $data")
}
