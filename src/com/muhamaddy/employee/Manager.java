package com.muhamaddy.employee;

public class Manager extends Employee {
    String departemen;
    public Manager(String nama, String nip, int gol, String departemen) {
        super(nama, nip, gol);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }
}
