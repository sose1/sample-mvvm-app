package pl.sose1.sample_mvvm_app.model

class Juice {
    private val juice = listOf("orange", "apple", "banana")
    fun getRandomJuice():String {
        return juice.random()
    }
}