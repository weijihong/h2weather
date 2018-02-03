package com.example.jahony.h2weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by jahony on 2018/2/2.
 */

public class County extends DataSupport {
    private int id;
    private String countryName;
    private String weatherId;
    private int cityId;


    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
