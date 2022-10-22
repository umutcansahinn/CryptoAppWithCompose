package com.umutcansahin.cryptoappwithcompose.di

import com.umutcansahin.cryptoappwithcompose.repository.CryptoRepository
import com.umutcansahin.cryptoappwithcompose.service.CryptoAPI
import com.umutcansahin.cryptoappwithcompose.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideCryptoRepository(api: CryptoAPI) = CryptoRepository(api)

    @Singleton
    @Provides
    fun provideCryptoApi(): CryptoAPI {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(CryptoAPI::class.java)
    }
}