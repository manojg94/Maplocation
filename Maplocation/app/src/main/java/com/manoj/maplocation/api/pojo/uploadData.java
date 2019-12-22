package com.manoj.maplocation.api.pojo;

public class uploadData {
    private  String name;
    private  String loc;
    private  String time;

    public uploadData(String name, String loc, String time) {
        this.name = name;
        this.loc = loc;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
