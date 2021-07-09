package com.main.harfNotu;

import java.util.Scanner;

public class HarfNotu {
    public void harfNotuHesaplama(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize notunu girin: ");
        int vizeNot = scanner.nextInt();
        System.out.print("Final notunu girin: ");
        int finalNot = scanner.nextInt();

        double donemNotu = donemSonuHesaplama(vizeNot, finalNot);
        System.out.println("Dönem Sonu Notu :" + donemNotu);
        System.out.println("");
        System.out.println("");

        System.out.print("Harf Notu :");
        if (donemNotu >= 70 && donemNotu <= 100) {
            System.out.print("AA");
        } else if (donemNotu >= 50 && donemNotu < 70) {
            System.out.print("BB");
        } else if (donemNotu >= 20 && donemNotu < 50) {
            System.out.print("CB");
        } else {
            System.out.print("FF");
        }
    }

    public static double donemSonuHesaplama(int vizenot, int finalnot) {
        return (vizenot * 0.4) + (finalnot * 0.6);
    }
}
