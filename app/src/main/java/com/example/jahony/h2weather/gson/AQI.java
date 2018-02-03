package com.example.jahony.h2weather.gson;

/**
 * Created by jahony on 2018/2/3.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
