package com.example.android.sunshine.app;

/**
 * Created by vomil_000 on 30.07.2016.
 */
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeatherDataParser {

    /**
     * Given a string of the form returned by the api call:
     * http://api.openweathermap.org/data/2.5/forecast/daily?q=94043&mode=json&units=metric&cnt=7
     * retrieve the maximum temperature for the day indicated by dayIndex
     * (Note: 0-indexed, so 0 would refer to the first day).
     */
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
        // TODO: add parsing code here
        JSONObject node = new JSONObject(weatherJsonStr);
        node.getJSONArray("list");
        JSONObject dayNode =  node.getJSONArray("list").getJSONObject(dayIndex);

        return dayNode.getJSONObject("temp").getDouble("max");
    }

}
