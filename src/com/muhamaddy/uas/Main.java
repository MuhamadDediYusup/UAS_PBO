package com.muhamaddy.uas;

import com.muhamaddy.uas.*;

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Cabang cabang = new Cabang();
        Nasabah nasabah = new Nasabah(0,0," "," "," ");

        while(true) {
            System.out.println("Data Bank ABC");
            System.out.println("1. Input Data Nasabah");
            System.out.println("2. Tampilkan Data Nasabah");
            System.out.println("3. Tampilkan Detail Cabang");
            System.out.println("4. Keluar");
            System.out.print("Pilihan : ");
            int pilihan = Integer.parseInt(br.readLine());

            switch (pilihan) {
                case 1:
                    System.out.println("Pilih Cabang");
                    System.out.println("1. Cabang Yogyakarta");
                    System.out.println("2. Cabang Wonogiri");
                    System.out.print("Pilihan : ");
                    int pilihanCab = Integer.parseInt(br.readLine());
                    switch (pilihanCab) {
                        case 1:
                            System.out.print("Masukkan No. Rek: ");
                            int rekNas = Integer.parseInt(br.readLine());
                            System.out.print("Masukkan Nama   : ");
                            String namaNas = br.readLine();
                            System.out.print("Masukkan Alamat : ");
                            String alamatNas = br.readLine();
                            System.out.print("Masukkan No. Tlp: ");
                            String tlpNas = br.readLine();

                            nasabah = new Nasabah(112, rekNas, namaNas, alamatNas, tlpNas );
                            System.out.println("-> DATA BERHASIL DISIMPAN");
                            break;
                        case 2:
                            System.out.print("Masukkan No. Rek: ");
                            int rekNas2 = Integer.parseInt(br.readLine());
                            System.out.print("Masukkan Nama   : ");
                            String namaNas2 = br.readLine();
                            System.out.print("Masukkan Alamat : ");
                            String alamatNas2 = br.readLine();
                            System.out.print("Masukkan No. Tlp: ");
                            String tlpNas2 = br.readLine();
                            nasabah = new Nasabah(113, rekNas2, namaNas2, alamatNas2, tlpNas2 );
                            System.out.println("-> DATA BERHASIL DISIMPAN");
                            break;
                    } break;
                case 2:
                     nasabah.getDataNasabah();
                     break;
                case 3:
                    cabang.getDataCabang();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}

