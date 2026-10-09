package QUIZ.SESI3;

import java.util.Scanner;

public class ProgramDiskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total pembelian: Rp");
        double pembelian = input.nextDouble();

        double diskon;

        if (pembelian >= 500000) {
            diskon = pembelian * 10 / 100;
        } else if (pembelian >= 250000) {
            diskon = pembelian * 5 / 100;
        } else {
            diskon = 0;
        }

        double totalBayar = pembelian - diskon;

        System.out.println("Total pembelian : Rp" + pembelian);
        System.out.println("Diskon          : Rp" + diskon);
        System.out.println("Total bayar     : Rp" + totalBayar);

        input.close();
    }
}
