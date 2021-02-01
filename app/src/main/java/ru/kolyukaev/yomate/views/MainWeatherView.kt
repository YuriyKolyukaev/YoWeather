package ru.kolyukaev.yomate.views

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import ru.kolyukaev.yomate.data.models.RwWeatherAfter
import ru.kolyukaev.yomate.data.models.RwWeatherBefore

@StateStrategyType(value = SingleStateStrategy::class)
interface MainWeatherView: MvpView {
    fun startLoading()
    fun endLoading()
    fun showComponents()
    fun showHintWeatherAnimation()
    fun setIndentTopAndBottom()
    fun showError(text: String)
    fun replaceBackground(photoString: String)
    fun getWeatherResponse(weather: String, temperature: String, feelsLike: String, pressure: String, humidity: String, cloudiness: String, wind: String, icon: Int, visibility: String, precipitation: String)
    fun getWeatherHoursResponse(list: ArrayList<RwWeatherAfter>)

}