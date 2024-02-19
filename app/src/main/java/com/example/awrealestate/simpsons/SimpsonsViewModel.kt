package com.example.awrealestate.simpsons


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.network.simpsons.SimpsonsModel
import com.example.data.network.simpsons.SimpsonsService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SimpsonsViewModel @Inject constructor(
    private val service: SimpsonsService
) : ViewModel() {

    private var _simpsons = MutableLiveData<SimpsonsModel>()
    val simpsons: LiveData<SimpsonsModel> = _simpsons

    fun getSimpsons() {
        viewModelScope.launch(Dispatchers.IO) {
            val result = service.getSimpsons()

            _simpsons.postValue(result)
        }
    }
}