/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1_1H.Iftitah;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class SepedaMotorMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SepedaMotor motor = null;
        String status;
        int menu;

        System.out.println("|===============================|");
        System.out.println("|    Menu Jenis Sepeda Motor    |");
        System.out.println("|===============================|");
        System.out.println("| 1. Honda                      |");
        System.out.println("| 2. Yamaha                     |");
        System.out.println("| 3. Ducati                     |");
        System.out.println("| 4. Suzuki                     |");
        System.out.println("|===============================|");
        System.out.print("Pilih Jenis : ");
        int pilih = input.nextInt();
        if (pilih == 1) {
            motor = new SepedaMotor("Honda");
        } else if (pilih == 2) {
            motor = new SepedaMotor("Yamaha");
        } else if (pilih == 3) {
            motor = new SepedaMotor("Ducati");
        } else if (pilih == 4) {
            motor = new SepedaMotor("Suzuki");
        }
        System.out.println("");

        System.out.println("|-------------------------------|");
        System.out.println("|   Pilih Kondisi Sepeda Motor  |");
        System.out.println("|-------------------------------|");
        System.out.println("| 1. Nyalakan Mesin             |");
        System.out.println("| 2. Matikan Mesin              |");
        System.out.println("|-------------------------------|");
        System.out.print("Pilih Kondisi: ");
        int pilih2 = input.nextInt();
        System.out.println("");
        if (pilih2 == 1) {

            do {
                motor.nyalakanMotor(true);
                System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
                System.out.println("|   Pilih Kondisi Selanjutnya   |");
                System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
                System.out.println("| 1. Tambahkan Kecepatan        |");
                System.out.println("| 2. Kurangi Kecepatan          |");
                System.out.println("| 3. Matikan Mesin              |");
                System.out.println("| 4. Info                       |");
                System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
                System.out.print("Pilih Menu : ");
                menu = input.nextInt();
                System.out.println("");
                if (menu == 1) {
                    motor.tambahKecepatanMotor(5);
                } else if (menu == 2) {
                    motor.kurangiKecepatanMotor(5);
                } else if (menu == 3) {
                    motor.matikanMotor(true);
                    motor.info();
                    break;
                } else if (menu == 4) {
                    motor.info();
                }
                input.nextLine();
                System.out.print("Ingin berhenti? (Y/T) : ");
                status = input.nextLine();
                System.out.println("");
            } while ("T".equals(status));

        } else {
            motor.info();
            System.out.println("| Hidupkan Motor terlebih dahulu |");
            System.out.println("|--------------------------------|");
        }
    }
}
