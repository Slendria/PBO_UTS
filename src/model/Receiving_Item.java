package model;

public class Receiving_Item {
    private char[] kode_receiving_item = new char[8];
    private int kuantiti_terima;
    private long harga_satuan;
    private long total;
    private Item barang;

    public Receiving_Item() {
    }

    public Receiving_Item(char[] kode_receiving_item, int kuantiti_terima, long harga_satuan, long total, Item barang) {
        this.kode_receiving_item = kode_receiving_item;
        this.kuantiti_terima = kuantiti_terima;
        this.harga_satuan = harga_satuan;
        this.total = total;
        this.barang = barang;
    }

    public char[] getKode_receiving_item() {
        return this.kode_receiving_item;
    }

    public void setKode_receiving_item(char[] kode_receiving_item) {
        this.kode_receiving_item = kode_receiving_item;
    }

    public int getKuantiti_terima() {
        return this.kuantiti_terima;
    }

    public void setKuantiti_terima(int kuantiti_terima) {
        this.kuantiti_terima = kuantiti_terima;
    }

    public long getHarga_satuan() {
        return this.harga_satuan;
    }

    public void setHarga_satuan(long harga_satuan) {
        this.harga_satuan = harga_satuan;
    }

    public long getTotal() {
        return this.total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public Item getBarang() {
        return this.barang;
    }

    public void setBarang(Item barang) {
        this.barang = barang;
    }

    @Override
    public String toString() {
        return "{" +
            " kode_receiving_item='" + getKode_receiving_item() + "'" +
            ", kuantiti_terima='" + getKuantiti_terima() + "'" +
            ", harga_satuan='" + getHarga_satuan() + "'" +
            ", total='" + getTotal() + "'" +
            ", barang='" + getBarang() + "'" +
            "}";
    }

    
}
