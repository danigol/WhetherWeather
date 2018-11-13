package danigol.com.whetherweather

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = listOf(
        WeatherDay("Mon", R.drawable.ic_sunny, "Sunny", "65/59"),
        WeatherDay("Tue", R.drawable.ic_sunny, "Sunny", "64/57"),
        WeatherDay("Wed", R.drawable.ic_cloudy, "Cloudy", "64/57"),
        WeatherDay("Thu", R.drawable.ic_cloudy, "Cloudy", "64/57"),
        WeatherDay("Fri", R.drawable.ic_sunny, "Sunny", "64/57"),
        WeatherDay("Sat", R.drawable.ic_sunny, "Sunny", "64/57"),
        WeatherDay("Sun", R.drawable.ic_sunny, "Sunny", "64/57")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val forecastList = findViewById<RecyclerView>(R.id.forecast_list) as RecyclerView
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListAdapter(items)
    }
}
