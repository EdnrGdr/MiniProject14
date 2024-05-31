import java.net.ServerSocket;
import java.util.Scanner;

public class Main {

    /*

    ;MethodOverloading kullanarak hesap makinesi yapma
    Toplama ve Çıkarma Metodlarını 2 veya 3 parametre alacak sekilde tasarlayın
     */




   public static int cıkarma ( int a , int b) {

       return (a-b);
   }

   public static double bölme ( int a, int b) {

       return ((double)a /b);
   }
    public static int toplama ( int a,int b) {
return (a+b);

    }

    public static int toplama ( int a, int b ,int c) {

return (a + b + c);
    }

    public static int carpma ( int a,int b) {
return (a*b);

    }

    public static int carpma ( int a, int b, int c) {

return ( a*b*c);
    }
    public static void main ( String[] args) {
        Scanner scanner = new Scanner(System.in);

        String islemler = "1. İşlem Toplama İşlemi\n" +
                "2.İşlem Çıkarma İşlemi\n" +
                "3.İşlem Çarpma İşlemi\n" +
                "4.İşlem Bölme İşlemi\n" +
                "Çıkış İçin q ' ya Basınız..";

        System.out.println("***********************************");

        System.out.println(islemler);

        System.out.println("***********************************");


        while (true) {


            System.out.println("Yapmak İstediğiniz İslemi Seciniz..");

            String islem = scanner.nextLine();


            if (islem.equals("q")) {

                System.out.println("Çıkış Yapılıyor..");
                break;


            } else if (islem.equals("1")) {
                System.out.print("Kaç Değer Gireceksiniz.. ( 2 veya 3):");
                int kacsayi = scanner.nextInt();

                if ( kacsayi ==2) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Toplam:" + toplama(a,b));


                } else if ( kacsayi==3){

                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Toplam:" + toplama(a,b,c));


                } else {

                    System.out.println("Bunun içşn uygun metod bulunmuyor..");
                }



            } else if (islem.equals("2")) {
                System.out.print("a:");
                int a = scanner.nextInt();
                System.out.print("b: ");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Sonuç:" + cıkarma(a,b));


            } else if (islem.equals("3")) {

                System.out.print("Kaç Değer Gireceksiniz.. ( 2 veya 3):");
                int kacsayi = scanner.nextInt();

                if ( kacsayi ==2) {
                    System.out.print("a:");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Çarpma:" + carpma(a,b));


                } else if ( kacsayi==3){

                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Çarpma:" + carpma(a,b,c));


                } else {

                    System.out.println("Bunun için uygun metod bulunmuyor..");
                }
            } else if (islem.equals("4")) {

                System.out.print("a:");
                int a = scanner.nextInt();
                System.out.print("b: ");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Sonuç:" + bölme(a,b));



            } else {

                System.out.println("Hatalı Giriş Tekrar Deneyiniz..");
                break;
            }


        }
    }

}

