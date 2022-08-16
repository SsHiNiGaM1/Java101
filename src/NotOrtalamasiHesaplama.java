import  java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int mat, fizik, kimya, turkce, tarih, muzik;


        System.out.print("Matematik Notunu Giriniz: ");
        mat = scan.nextInt();

        System.out.print("Fizik Notunu Giriniz: ");
        fizik = scan.nextInt();

        System.out.print("Kimya Notunu Giriniz: ");
        kimya = scan.nextInt();

        System.out.print("Turkce Notunu Giriniz: ");
        turkce = scan.nextInt();

        System.out.print("Tarih Notunu Giriniz: ");
        tarih = scan.nextInt();

        System.out.print("Muzik Notunu Giriniz: ");
        muzik = scan.nextInt();

        int toplam = (mat + fizik + kimya + turkce +tarih + muzik);
        double sonuc = toplam / 6.0;

        System.out.println("Ortalamaniz:" + sonuc );
        System.out.println(sonuc >= 60.0 ? "Sinifi gecti" : "Siniftan kaldi");


    }
}