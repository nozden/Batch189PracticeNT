package practice06;

public class C01Encapsulation {

    /*
    bir class olusturun
    private access mod sahip variablelar olusturun: isim, soyisim, yas seklinde
    parametreli ve parametresiz constructor olusturun
    bu variablelara ait getter setter methodlarını olusturun
    toString methodunu olusturun
     */

    private String isim;
    private String soyisim;
    private int yas;

    //1-parametreli constructor
    public C01Encapsulation(String isim, String soyisim, int yas) {

        //setIsim(isim)
        if (isim.charAt(0)>='A' && isim.charAt(0)<='Z'){
            this.isim = isim;
        }else{
            System.out.println("Isim buyuk harfle baslamalı.");
        }



        this.soyisim = soyisim;

        //setYas(yas) da kullanılabilir
        if (yas<0){
            System.out.println("Yas negatif deger alamaz");
        }else{
            this.yas = yas;
        }

    }

    //2-parametresiz constructor
    public C01Encapsulation() {
    }

    //3- getter setter


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {

        if (isim.charAt(0)>='A' && isim.charAt(0)<='Z'){
            this.isim = isim;
        }else{
            System.out.println("Isim buyuk harfle baslamalı.");
        }





    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }


    public void setYas(int yas) {

        if (yas<0){
            System.out.println("Yas negatif deger alamaz");
        }else{
            this.yas = yas;
        }

    }





    //4- toString()->bir objeyi yazdırmaya yarar
    @Override
    public String toString() {
        return "C01Encapsulation{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                '}';
    }




}
