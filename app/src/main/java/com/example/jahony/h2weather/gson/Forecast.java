package com.example.jahony.h2weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jahony on 2018/2/3.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("text_d")
        public String info;
    }
}
