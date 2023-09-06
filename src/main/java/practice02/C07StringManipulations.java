package practice02;

import java.util.Scanner;

public class C07StringManipulations {
    public static void main(String[] args) {

     /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk olacak geri kalanı kucuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ad ve soyadınızı aralarında bir bosluk olacak sekilde girin " +
                "\nNOT:Yalnızca bir ad bir soyad girilmeli");

        String adSoyad = scan.nextLine().trim();
        //Ali Can  --> spaceIdx : 3
        int spaceIdx = adSoyad.indexOf(" ");
        String ad = adSoyad.substring(0, spaceIdx);
        //substring 2 parametre ile kullanılısa ;ilk index dahil, ikinci index harictir
        //substring tek parametre ile kullanılırsa indx dahil stringin sonuna kadar alır
        String soyad = adSoyad.substring(spaceIdx + 1);

        //aLi  CaN  ---
        //Ali Can

        String ad2 = ad.toUpperCase().charAt(0) + ad.toLowerCase().substring(1);
        String soyad2 = soyad.toUpperCase().charAt(0) + soyad.toLowerCase().substring(1);
        System.out.println(ad2);
        System.out.println(soyad2);

    }
}
