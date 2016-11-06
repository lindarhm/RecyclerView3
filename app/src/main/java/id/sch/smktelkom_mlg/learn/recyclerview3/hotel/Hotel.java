package id.sch.smktelkom_mlg.learn.recyclerview3.hotel;

import android.graphics.drawable.Drawable;

/**
 * Created by nurlinda on 11/5/2016.
 */
public class Hotel {
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
