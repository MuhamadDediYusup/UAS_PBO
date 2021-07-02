package com.muhamaddy.employee;

public class Main {
    public static void main(String[] args) {
       Manager mgr = new Manager("Muhamad Dedi Yusup","121233",1,"HRD");

        System.out.println("====PROGRAM EMPLOYEE====");
        System.out.println("Nama Karyawan : " + mgr.getNama());
        System.out.println("NIP Karyawan  : " + mgr.getNip());
        System.out.println("Golongan      : " + mgr.getGol());
        System.out.println("Departemen    : " + mgr.getDepartemen());
    }
}
