package practice03;

import java.util.Scanner;

public class C01ForLoop {

    public static void main(String[] args) {

            /*
            Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
           */


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next();


        //charAt ( index )
        //merhaba  ->6  son ch indexi lenght-1
        int sayac=0;
        for (int i = 0; i < kelime.length() ; i++) {

            if (kelime.charAt(i)=='c'){
                break;
            } else if (kelime.charAt(i)=='a') {
                sayac++;
            }


        }
        System.out.println("Ilk c harfine kadar olan a harflerinin sayisi : "+sayac);

    }
}
