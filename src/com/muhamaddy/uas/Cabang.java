package com.muhamaddy.uas;

public class Cabang {
    int idCabang;
    String namaCabag;
    String alamatCabang;

    Cabang() {

    }

    public void cabang1() {
        idCabang = 112;
        namaCabag = "Bank ABC Cabang Yogyakarta";
        alamatCabang = "Jl. Tentara Rakyat Mataram No. 51";
        System.out.println("ID Cabang     : " + idCabang);
        System.out.println("Nama Cabang   : " + namaCabag);
        System.out.println("Alamat Cabang : " + alamatCabang);
    }

    public void cabang2() {
        idCabang = 113;
        namaCabag = "Bank ABC Cabang Wonogiri";
        alamatCabang = "Jl. Soederman Km.12";
        System.out.println("ID Cabang     : " + idCabang);
        System.out.println("Nama Cabang   : " + namaCabag);
        System.out.println("Alamat Cabang : " + alamatCabang);
    }

    public void getDataCabang(){
        System.out.println("------DETAIL CABANG-------");
        cabang1();
        System.out.println("--------------------------");
        cabang2();
        System.out.println("--------------------------");
    }
}
