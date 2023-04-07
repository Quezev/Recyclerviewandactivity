package com.example.projectapliacation;

public class Motor {
    String nama;
    int foto;

    public Motor(String nama, int foto) {
        this.nama = nama;
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
