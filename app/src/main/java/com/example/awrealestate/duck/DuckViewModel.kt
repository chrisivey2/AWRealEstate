package com.example.awrealestate.duck

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.network.duck.DuckModel
import com.example.data.network.duck.DuckService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DuckViewModel @Inject constructor(
    private val service: DuckService
) : ViewModel() {

    private var _duck = MutableLiveData<DuckModel>()
    val duck: LiveData<DuckModel> = _duck

    fun getDuck() {
        viewModelScope.launch(Dispatchers.IO) {
            val result = service.getDuck()

            _duck.postValue(result)
        }
    }
}