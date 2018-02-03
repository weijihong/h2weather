package com.example.jahony.h2weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jahony on 2018/2/3.
 */

public class Basic {
    //由于JSON中的一些字段不太适合直接作为Java字段来命名，通过serializedName注释的方式来让JSON字段和java字段建立映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
