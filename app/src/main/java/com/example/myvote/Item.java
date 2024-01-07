package com.example.myvote;

public class Item {
    String name;
    String party;
    String current_pos;
    String desc;
    String desc2;
    String desc3;
    String desc4;
    int image;

    public Item(String name, String party, String current_pos, String desc, String desc2, String desc3, String desc4, int image) {
        this.name = name;
        this.party = party;
        this.current_pos = current_pos;
        this.desc = desc;
        this.desc2 = desc2;
        this.desc3 = desc3;
        this.desc4 = desc4;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getCurrent_pos() {
        return current_pos;
    }

    public void setCurrent_pos(String current_pos) {
        this.current_pos = current_pos;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc2() {
        return desc2;
    }

    public void setDesc2(String desc2) {
        this.desc2 = desc2;
    }

    public String getDesc3() {
        return desc3;
    }

    public void setDesc3(String desc3) {
        this.desc3 = desc3;
    }

    public String getDesc4() {
        return desc4;
    }

    public void setDesc4(String desc4) {
        this.desc4 = desc4;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

