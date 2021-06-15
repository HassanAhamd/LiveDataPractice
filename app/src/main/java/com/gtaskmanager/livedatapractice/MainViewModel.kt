package com.gtaskmanager.livedatapractice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val livedataObject = MutableLiveData<String>("This is Mutable LiveData")

    val livedata = livedataObject


    fun updatelivedata(){
        livedata.value = "This is Updated MutableLiveData"
    }
}