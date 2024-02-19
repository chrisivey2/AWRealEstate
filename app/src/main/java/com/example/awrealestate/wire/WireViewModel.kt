package com.example.awrealestate.wire


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.network.wire.WireModel
import com.example.data.network.wire.WireService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

    @HiltViewModel
    class WireViewModel @Inject constructor(
        private val service: WireService
    ) : ViewModel() {

        private var _wire = MutableLiveData<WireModel>()
        val wire: LiveData<WireModel> = _wire

        fun getWire() {
            viewModelScope.launch(Dispatchers.IO) {
                val result = service.getWire()

                _wire.postValue(result)
            }
        }
    }
