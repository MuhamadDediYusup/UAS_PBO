package com.muhamaddy.employee;

public class Employee {
    String nama, nip;
    int gol;

    public  Employee(String nama, String nip, int gol) {
        this.nama = nama;
        this.nip = nip;
        this.gol = gol;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public int getGol() {
        return gol;
    }

}
