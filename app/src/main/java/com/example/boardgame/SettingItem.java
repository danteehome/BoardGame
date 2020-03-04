package com.example.boardgame;

public class SettingItem {
    private String settings;
    private boolean isChecked;

    public void setSettings(String settings) {
        this.settings = settings;
    }

    public boolean isChecked() {
        return isChecked;
    }


    public SettingItem(String settings, Boolean isChecked){
        this.isChecked=isChecked;
        this.settings=settings;
    }

    public String getSettings() {
        return settings;
    }
}



