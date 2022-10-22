package com.umutcansahin.cryptoappwithcompose.repository

import com.umutcansahin.cryptoappwithcompose.module.Crypto
import com.umutcansahin.cryptoappwithcompose.module.CryptoList
import com.umutcansahin.cryptoappwithcompose.service.CryptoAPI
import com.umutcansahin.cryptoappwithcompose.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class CryptoRepository @Inject constructor(
    private val api: CryptoAPI
) {

    suspend fun getCryptoList(): Resource<CryptoList> {
        val responce = try {
            api.getCryptoList()
        }catch (e: Exception) {
            return Resource.Error("Error.")
        }
        return Resource.Success(responce)
    }

    suspend fun getCrypto() : Resource<Crypto> {
        val responce = try {
            api.getCrypto()
        }catch (e: Exception) {
            return Resource.Error("Error.")
        }
        return Resource.Success(responce)
    }
}