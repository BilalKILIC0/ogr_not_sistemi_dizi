//Öğrenci Not Sistemi
package ogrenci_not_sistemi;

import java.util.Scanner;

public class Ogrenci_not_sistemi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double ders_toplam = 0;
        double sonuc;

        System.out.println("Lütfen Aldığınız Ders Sayısını Giriniz :");
        int ders_sayi = input.nextInt();
        input.nextLine();

        String ders[] = new String[ders_sayi];

        int puan[] = new int[ders.length];

        System.out.println("**********************************************");

        for (int i = 0; i <= ders.length - 1; i++) {

            System.out.printf("Lütfen " + (i + 1) + ". Dersin Adını Giriniz :\n");
            ders[i] = input.nextLine();

        }
        for (int j = 0; j <= ders.length - 1; j++) {

            System.out.println("Lütfen " + ders[j] + " Dersinin Notunu Giriniz :");
            puan[j] = input.nextInt();
            ders_toplam += puan[j];
            input.nextLine();
        }

        System.out.println("***********************************************");

        System.out.println("Aldığınız Derslerin Notlarını Görmek İstiyor Musunuz ? "
                + "Evet ise Evet / Hayır ise Hayır Yazınız.");
        String secim = input.nextLine();

        if (secim.equals("Evet")) {

            for (int i = 0; i <= ders.length - 1; i++) {

                System.out.println(ders[i] + " Dersinin Notu : " + puan[i]);

            }
        } else {
            System.out.println("Dersler Ve Notlar Listelenmemiştir.");
        }

        System.out.println("***********************************************");

        System.out.println("Ders Ortalamasını Görmek İstiyor Musunuz ? "
                + "Evet ise Evet / Hayır ise Hayır Yazınız.");
        String secim2 = input.nextLine();

        if (secim2.equals("Evet")) {

            sonuc = (double) ders_toplam / puan.length;

            System.out.println("Dönem Ortalamanız : " + sonuc);

        } else {
            System.out.println("Ortalamanız Hesaplanmamıştır.");
        }

    }

}
