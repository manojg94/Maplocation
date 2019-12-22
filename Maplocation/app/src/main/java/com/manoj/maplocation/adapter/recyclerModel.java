package com.manoj.maplocation.adapter;

public class recyclerModel {


    private String title;
    private String temp;
    private String maxtemp;
    private String mintemp;
    private String humidity;


    public recyclerModel(String title, String temp, String maxtemp, String mintemp, String humidity) {
        this.title = title;
        this.temp = temp;
        this.maxtemp = maxtemp;
        this.mintemp = mintemp;
        this.humidity = humidity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getMaxtemp() {
        return maxtemp;
    }

    public void setMaxtemp(String maxtemp) {
        this.maxtemp = maxtemp;
    }

    public String getMintemp() {
        return mintemp;
    }

    public void setMintemp(String mintemp) {
        this.mintemp = mintemp;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
}
