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
    boolean kontakMotor = false;
    int kecepatanMotor;
    
    SepedaMotor(){

    }
    SepedaMotor(String mrk){
        merk = mrk;
    }
    void nyalakanMotor(boolean nm){
        kontakMotor = nm;
    }
    void matikanMotor (boolean mm){
        kontakMotor = mm;
    }
    void tambahKecepatanMotor(int tam){
        if (kecepatanMotor == 100) {
            System.out.println("--------------------------------");
            System.out.println("Maksimal kecepatan adalah 100 km");
            System.out.println("--------------------------------");
        }else{
            this.kecepatanMotor += tam;
        }
    }
    void kurangiKecepatanMotor (int kur){
        if (kecepatanMotor == 0) {
            System.out.println("--------------------------------");
            System.out.println(" Minimal kecepatan adalah 0 km");
            System.out.println("--------------------------------");
        }else{
            this.kecepatanMotor -= kur;
        }
    }
    void info(){
        if (kontakMotor==true) {
            System.out.println("SEPEDA MOTOR TELAH DIHIDUPKAN");
        } else{
            System.out.println("SEPEDA MOTOR TELAH DIMATIKAN");
        } 
        System.out.println("KECEPATAN : " + kecepatanMotor);
    }
}
