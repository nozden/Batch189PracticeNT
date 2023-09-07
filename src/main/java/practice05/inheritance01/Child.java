package practice05.inheritance01;

public class Child extends Parent {

    int yas=10;

    public static void main(String[] args) {

        Parent.method1();
        method1();
        method2();
        System.out.println("Parent.isim = " + Parent.isim);
        System.out.println("isim = " + isim);
        System.out.println("soyisim = " + soyisim);
        isim="Veli";
        System.out.println("isim = " + isim);

        Child obj1=new Child();
        obj1.method3();
        obj1.method4();
        System.out.println("obj1.yas = " + obj1.yas);

        Parent obj2=new Parent();
        System.out.println("obj2.yas = " + obj2.yas);
        obj2.method3();
        obj2.method4();


    }




}
