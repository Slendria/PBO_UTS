package model;

import java.util.ArrayList;

public class Item {
    private String kodeItem;
    private String namaItem;
    private String Kategori;
    private int stock;

    public item() {
    }

    public item(String kodeItem, String namaItem, String Kategori, int stock) {
        this.kodeItem = kodeItem;
        this.namaItem = namaItem;
        this.Kategori = Kategori;
        this.stock = stock;
    }

    public String getKodeItem() {
        return this.kodeItem;
    }

    public void setKodeItem(String kodeItem) {
        this.kodeItem = kodeItem;
    }

    public String getNamaItem() {
        return this.namaItem;
    }

    public void setNamaItem(String namaItem) {
        this.namaItem = namaItem;
    }

    public String getKategori() {
        return this.Kategori;
    }

    public void setKategori(String Kategori) {
        this.Kategori = Kategori;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "{" +
            " kodeItem='" + getKodeItem() + "'" +
            ", namaItem='" + getNamaItem() + "'" +
            ", Kategori='" + getKategori() + "'" +
            ", stock='" + getStock() + "'" +
            "}";
    }

}
