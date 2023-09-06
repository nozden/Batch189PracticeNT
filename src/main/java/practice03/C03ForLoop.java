package practice03;

import java.util.Scanner;

public class C03ForLoop {
    public static void main(String[] args) {

            /*
            Kullanıcıdan sisteme satır sayısını girmesini isteyiniz.
            ve ardından yıldız işaretini kullanarak bir dik üçgen çizin

            Satır sayısı = 4 ==>      *
                                      * *
                                      * * *
                                      * * * *
            */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen satır sayısını giriniz");
        int satirSayisi = scan.nextInt();

        for (int i = 0; i < satirSayisi; i++) {//satir dongusu için

            for (int j = 0; j <= i ; j++) {//* yazdırma islemi için(sutun için)
                System.out.print("* ");

            }
            System.out.println();//imleci konsolda alt satıra gecirir
        }


    }
}
