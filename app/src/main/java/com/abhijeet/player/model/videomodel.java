package com.abhijeet.player.model;

public class videomodel {

    String str_path;
    boolean boolean_selected;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    int duration;
    public String getStr_name() {
        return str_name;
    }

    public void setStr_name(String str_name) {
        this.str_name = str_name;
    }

    String str_name;

    public String getStr_path() {
        return str_path;
    }

    public void setStr_path(String str_path) {
        this.str_path = str_path;
    }

    public String getStr_thumb() {
        return str_thumb;
    }

    public void setStr_thumb(String str_thumb) {
        this.str_thumb = str_thumb;
    }

    public boolean isBoolean_selected() {
        return boolean_selected;
    }

    public void setBoolean_selected(boolean boolean_selected) {
        this.boolean_selected = boolean_selected;
    }

    String str_thumb;

}
