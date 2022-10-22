package com.umutcansahin.cryptoappwithcompose.viewmodel

import androidx.lifecycle.ViewModel
import com.umutcansahin.cryptoappwithcompose.module.Crypto
import com.umutcansahin.cryptoappwithcompose.repository.CryptoRepository
import com.umutcansahin.cryptoappwithcompose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CryptoDetailViewModel @Inject constructor(
    private val repository: CryptoRepository
) : ViewModel() {

    suspend fun getCrypto(): Resource<Crypto>  {
        return repository.getCrypto()
    }




}