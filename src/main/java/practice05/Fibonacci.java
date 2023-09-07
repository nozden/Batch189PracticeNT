package practice05;

import java.util.Scanner;

public class Fibonacci {

    /*
    Kulanıcıdan alınan bir tam sayı kadar eleman içeren (47den kucuk olmak kosuluyla)
    FIBONACCI dizisi olusturun(Bunu bir method olusturarak yazınız)
    Ör: sayi=10 için
    0-1-1-2-3-5-8-13-21-34 gibi
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 47den kucuk bir tamsayı giriniz");
        int sayi = scan.nextInt();

        fibonacci(sayi);

    }

    public static void fibonacci(int sayi) {

        int num1 = 0;
        int num2 = 1;
        int num3;

        //0-1-1-2-3-5-8-13-21-34 gibi


        if (sayi < 47 && sayi > -1) {
            for (int i = 0; i < sayi; i++) {

                System.out.print(num1 + " ");
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;

            }
        } else System.out.println("Lutfen gecerli bir tam sayı giriniz");


    }


}
