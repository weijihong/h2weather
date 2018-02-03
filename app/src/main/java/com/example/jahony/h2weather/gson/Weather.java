package com.example.jahony.h2weather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by jahony on 2018/2/3.
 */

public class Weather {
    //创建一个总的实例类来引用刚刚创建的各个实体类
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
