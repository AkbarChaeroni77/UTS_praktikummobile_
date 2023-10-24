package com.example.uts_trimuktiakbarchaeroni;

import java.io.Serializable;

public class Makanan implements Serializable {
    private String Judul;
    private int img;

    public Makanan(String judul, int img) {
        Judul = judul;
        this.img = img;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
