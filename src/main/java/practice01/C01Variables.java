package practice01;

public class C01Variables {//class bası

    public static void main(String[] args) {//main method bası
        //(int) bir variable(yas)  olustur ve yazdır
        //syntax :
        //data turu + variable ismi + atama operatoru + variable deger + ;
        int           yas                   =            35              ;

        System.out.println(yas);

        //(int) bir variable(sayi)  olustur ve yazdır
        int sayi = 50 ;
        System.out.println(sayi);


        //konsola sayi = 50 seklinde yazdır
        System.out.println("sayi = " + sayi );//variable'ı etiketiyle(ismiyle) yazdırma işlemidir

        System.out.println("sayi = " + sayi);//soutv
        System.out.println("yas = " + yas);
        //yeni bir variable olustur(benimYasim) ve yas variable'inin degerini benimYasim variable'ına kopyala
        int benimYasim = yas ;
        System.out.println("benimYasim = " + benimYasim);

        //String bir variable olusturalım (isim)

        String  isim = "Can" ;

        //isim variable ını etiketıyle yazdır
        System.out.println(isim);//Can
        System.out.println("isim = " + isim);


        //onunIsmi variable'ı olustur ve isim variable'ının degerini onunIsmi variable'ına kopyala

       // String onunIsmi = "Can" ;
        String onunIsmi = isim ;

        //onunIsmi variable'ını etiketiyle yazdır
        System.out.println("onunIsmi = " + onunIsmi);

        //isim variable'ının degerini guncelle
        isim ="Ali";



        //isim ve onunIsmi variable'larını yazdır

        System.out.println("isim = " + isim);//isim = Ali

        System.out.println("onunIsmi = " + onunIsmi);//onunIsmi = Can
        onunIsmi ="Veli";

        System.out.println("onunIsmi = " + onunIsmi);

    }//main method sonu

}//class sonu


