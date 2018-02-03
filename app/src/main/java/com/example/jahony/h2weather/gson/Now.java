package com.example.jahony.h2weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jahony on 2018/2/3.
 */

public class Now {

    @SerializedName("tmp")
    public String temperture;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }




}
