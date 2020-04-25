package com.badkrist.eurovision.service

import com.badkrist.eurovision.model.Country
import com.badkrist.eurovision.model.Song
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Path

interface FireBaseServices {
    @GET("countries")
    fun retrieveCountries(): Deferred<List<Country>>

    @GET("songs")
    fun retrieveSongs(): Deferred<List<Song>>
}