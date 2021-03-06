/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1_1H.Iftitah;

/**
 *
 * @author USER
 */
public class SepedaMotor {

    String merk;
    boolean kontakMotor;
    int kecepatanMotor = 0;

    SepedaMotor() {
    }

    SepedaMotor(String mrk) {
        merk = mrk;
        kontakMotor = false;
    }

    void nyalakanMotor(boolean nm) {
        kontakMotor = nm;
    }

    void matikanMotor(boolean mm) {
        if (mm == true) {
            kontakMotor = false;
        }
    }

    void tambahKecepatanMotor(int kec) {
        if (kecepatanMotor >= 100) {
            System.out.println("|--------------------------------|");
            System.out.println("|Maksimal kecepatan adalah 100 km|");
            System.out.println("|--------------------------------");
        } else {
            System.out.println("|--------------------------------|");
            System.out.println("|       Kecepatan ditambah       |");
            System.out.println("|--------------------------------|");
            this.kecepatanMotor += kec;
            System.out.println("| Kecepatan saat ini : " + this.kecepatanMotor+ "         |");
            System.out.println("|--------------------------------|");
        }
    }

    void kurangiKecepatanMotor(int kec) {
        if (kecepatanMotor <= 0) {
            System.out.println("|--------------------------------|");
            System.out.println("| Minimal kecepatan adalah 0 km  |");
            System.out.println("|--------------------------------|");
        } else {
            System.out.println("|--------------------------------|");
            System.out.println("|      Kecepatan dikurangi       |");
            System.out.println("|--------------------------------|");
            this.kecepatanMotor -= kec;
            System.out.println("| Kecepatan saat ini : " + this.kecepatanMotor + "         |");
            System.out.println("|--------------------------------|");
        }
    }

    void info() {
        System.out.println("|--------------------------------|");
        System.out.println("|   INFO KONDISI SEPEDA MOTOR    |");
        System.out.println("|--------------------------------|");
        System.out.println("|Jenis Sepeda Motor : " + merk+"      |");
        if (kontakMotor == true) {
            System.out.println("|Sepeda Motor Telah Dihidupkan   |");
        } else {
            System.out.println("|Sepeda Motor Kondisi Mati       |");
            this.kecepatanMotor = 0;
        }
        System.out.println("|Kecepatan : " + kecepatanMotor+"                   |");
        System.out.println("|--------------------------------|");
        
    }
}
