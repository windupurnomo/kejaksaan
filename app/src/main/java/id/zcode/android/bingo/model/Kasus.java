package id.zcode.android.bingo.model;

import java.util.Date;

public class Kasus {
    public String name;
    public Date date;
    public String pelapor;
    public String description;
    public String tipeKasus;


    public Kasus(String name, Date date) {
        this.name = name;
        this.date = date;
    }
}
