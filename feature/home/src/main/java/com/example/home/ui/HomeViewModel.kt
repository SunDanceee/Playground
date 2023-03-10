package com.example.home.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.home.data.HomeApi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val homeApi: HomeApi
) : ViewModel() {

    fun getBanners() {
        viewModelScope.launch {
            val bannerResponse = homeApi.getBanners()
            Log.d("ncq", "banners' size = ${bannerResponse.data?.size ?: 0}")
        }
    }

}