package com.main;

import com.main.harfNotu.HarfNotu;
import com.main.kirtasiye.Kirtasiye;

public class Main {

    public static void main(String[] args) {
        //Kırtasiye
        Kirtasiye kirtasiye = new Kirtasiye();
        kirtasiye.malGirisi(4);

        //Harfnotu
        HarfNotu harfNotu = new HarfNotu();
        harfNotu.harfNotuHesaplama();
    }
}
