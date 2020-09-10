package pl.sose1.sample_mvvm_app.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import pl.sose1.sample_mvvm_app.model.Juice

class JuiceViewModel : ViewModel() {
    val model = Juice()
    val juiceLiveData = MutableLiveData<String>()

    init {
        getRandomJuice()
    }

    fun getRandomJuice() {
        val juice = model.getRandomJuice()
        juiceLiveData.postValue(juice)
    }
}