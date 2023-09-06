package practice02;

import java.util.Scanner;

public class C04NestedTernary {
    public static void main(String[] args) {
         /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen birinci tam sayiyi giriniz");
        int a = scan.nextInt();

        System.out.println("Lutfen ikinci tam sayiyi giriniz");
        int b = scan.nextInt();

        //Object result = a == b ? "Sayilar birbirine esit" : a > b ? a : b;
        //System.out.println(result);

        System.out.println(a == b ? "Sayilar birbirine esit" : a > b ? a : b);

    }


}
