package com.muhamaddy.uas;

import java.util.ArrayList;

public class Nasabah {
    ArrayList idCabang = new ArrayList();
    ArrayList noRek = new ArrayList();
    ArrayList namaNasabah = new ArrayList();
    ArrayList alamatNasabah = new ArrayList();
    ArrayList noTelp = new ArrayList();

    Nasabah(int idCabang, int noRek, String nama, String alamat, String noTelp ) {
            this.idCabang.add(idCabang);
            this.namaNasabah.add(nama);
            this.noRek.add(noRek);
            this.alamatNasabah.add(alamat);
            this.noTelp.add(noTelp);
    }

    public void getDataNasabah() {
        for (int i = 0; i < this.idCabang.size(); i++) {
            System.out.println("--------DATA NASABAH------------");
            System.out.println("Cabang       = " + idCabang.get(i));
            System.out.println("Nama         = " + namaNasabah.get(i));
            System.out.println("No. Rekening = " + noRek.get(i));
            System.out.println("Alamat       = " + alamatNasabah.get(i));
            System.out.println("No. Telepon  = " + noTelp.get(i));
            System.out.println("################################");
        }

    }
}
