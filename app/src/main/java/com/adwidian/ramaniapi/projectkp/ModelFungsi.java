package com.adwidian.ramaniapi.projectkp;

/**
 * Created by apple on 2018/02/15.
 */

public class ModelFungsi {
    private int gambar;
    private String nama_puskesmas;
    private String alamat;
    private Double latitude;
    private Double longitude;

    public ModelFungsi(int gambar, String nama_puskesmas, String alamat, Double latitude, Double longitude){
        this.gambar = gambar;
        this.nama_puskesmas = nama_puskesmas;
        this.alamat = alamat;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getGambar(){
        return gambar;
    }
    public String getNama_puskesmas(){
        return nama_puskesmas;
    }
    public String getAlamat(){
        return alamat;
    }
    public Double getLatitude(){
        return latitude;
    }
    public Double getLongitude(){
        return longitude;
    }
}
