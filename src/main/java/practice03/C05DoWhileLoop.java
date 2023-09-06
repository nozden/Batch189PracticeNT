package practice03;

import java.util.Scanner;

public class C05DoWhileLoop {

    public static void main(String[] args) {

        /*
          Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
          Kullaniciya bitirmek istediginde 0'a basmasini soyleyin

          kullanici bitirmek istediginde
          toplam kac adet pozitif tam sayi girdigini
          ve bunlarin toplaminin kac oldugunu yazdirin

          Kullanici negatif sayi girerse
          "negatif sayi kullanamazsiniz " yazdirin
          bu negatif sayiyi sayi adedine ve toplama eklemeyin
         */


        Scanner scan = new Scanner(System.in);

        int sayac=0;
        int toplam=0;

        do {

            System.out.println("Lutfen pozitif bir tamsayi giriniz\nBitirmek icin 0'a basin");
            int sayi= scan.nextInt();

            if (sayi==0){
                break;
            } else if (sayi<0) {
                System.out.println("Negatif sayı kullanamazsın");
                continue;
            }

            //son kalan durum sayinin pozitif olma durumu bu yuzden else kullandık
                toplam+=sayi;//toplam=toplam+sayi
                sayac++;

        }while(true);


        System.out.println("Girdiginiz "+sayac+" adet pozitif tamsayının toplamı : "+toplam);

    }
}
