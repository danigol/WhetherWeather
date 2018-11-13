package danigol.com.whetherweather

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = listOf(
            "Mon 11/12 - Partly Cloudy - 50/42",
            "Tue 11/13 - Cloudy - 49/39",
            "Wed 11/14 - Partly Sunny - 51/42",
            "Thu 11/15 - Partly Cloudy - 49/42",
            "Fri 11/16 - Partly Sunny - 55/39",
            "Sat 11/17 - Sunny - 60/49",
            "Sun 11/18 - Rain - 50/37"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val forecastList = findViewById<RecyclerView>(R.id.forecast_list) as RecyclerView
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListAdapter(items)
    }
}
