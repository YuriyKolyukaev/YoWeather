package ru.kolyukaev.yoweather.data.network.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import ru.kolyukaev.yoweather.data.network.response.MainResponseAll

interface WeatherService {
    @GET("/data/2.5/forecast")
    fun getWeatherData(@Query("id") id: Int,
                       @Query("appid") app_id: String,
                       @Query("units") units: String): Call<MainResponseAll>

}
