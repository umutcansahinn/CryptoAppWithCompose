package com.umutcansahin.cryptoappwithcompose.service

import com.umutcansahin.cryptoappwithcompose.module.Crypto
import com.umutcansahin.cryptoappwithcompose.module.CryptoList
import retrofit2.http.GET
import retrofit2.http.Query

interface CryptoAPI {

    @GET(value = "atilsamancioglu/IA32-CryptoComposeData/main/cryptolist.json")
    suspend fun getCryptoList() : CryptoList

    @GET(value = "atilsamancioglu/IA32-CryptoComposeData/main/crypto.json")
    suspend fun getCrypto(): Crypto


/*
    @GET(value = "prices")
    suspend fun getCryptoList(
        @Query(value = "key") key: String
    ) : CryptoList

    @GET(value = "currencies")
    suspend fun getCrypto(
        @Query(value = "key") key: String,
        @Query(value = "ids") id: String,
        @Query(value = "attributes") attributes: String
    ): Crypto
*/



}