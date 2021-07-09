package com.main.kirtasiye;

import java.util.Scanner;

public class Kirtasiye {
    public void malGirisi(int malSayisi) {
        Scanner scanner = new Scanner(System.in);
        String[] mallar = new String[malSayisi];
        Integer[] malSayilari = new Integer[malSayisi];
        for(int i=1; i<=malSayisi; i++){
            scanner.nextLine();
            System.out.println(i+"."+" Malınızın ismini giriniz");
            mallar[i-1] = scanner.nextLine();
            System.out.println(mallar[i-1]+" sayısını giriniz");
            malSayilari[i-1] = scanner.nextInt();
        }

        int toplamMal = 0;
        
        for(int i = 0; i<malSayisi; i++){
            toplamMal += malSayilari[i];
        }
        System.out.println("Toplam Mal Sayınız : " + toplamMal);

        System.out.println("Hangi Maldan Kaç Tane Var?");
        for(int i = 0; i<malSayisi; i++){
            System.out.println(mallar[i] + " : " + malSayilari[i]);
        }

        System.out.println("Kaç Çeşit Mal Var? : "+malSayisi);
    }
}
