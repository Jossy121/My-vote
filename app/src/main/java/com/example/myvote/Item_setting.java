package com.example.myvote;

public class Item_setting {

    String settings1;
    String set_des;
    int image;

    public Item_setting(String settings1, String set_des, int image) {
        this.settings1 = settings1;
        this.set_des = set_des;
        this.image = image;
    }

    public String getSettings1() {
        return settings1;
    }

    public void setSettings1(String settings1) {
        this.settings1 = settings1;
    }

    public String getSet_des() {
        return set_des;
    }

    public void setSet_des(String set_des) {
        this.set_des = set_des;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
