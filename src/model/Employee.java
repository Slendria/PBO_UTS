package model;

import java.util.ArrayList;


public class Employee 
{
    private String kodePegawai, namaPegawai;
    private String alamat;


    public Employee() {
    }

    public Employee(String kodePegawai, String namaPegawai, String alamat) {
        this.kodePegawai = kodePegawai;
        this.namaPegawai = namaPegawai;
        this.alamat = alamat;
    }

    public String getKodePegawai() {
        return this.kodePegawai;
    }

    public void setKodePegawai(String kodePegawai) {
        this.kodePegawai = kodePegawai;
    }

    public String getNamaPegawai() {
        return this.namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    @Override
    public String toString() {
        return "{" +
            " kodePegawai='" + getKodePegawai() + "'" +
            ", namaPegawai='" + getNamaPegawai() + "'" +
            ", alamat='" + getAlamat() + "'" +
            "}";
    }
    

}
