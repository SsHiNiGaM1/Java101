import java.util.Scanner;

public class KDVTutariHesaplayanProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Para degerini giriniz:");
        double paradegeri = scan.nextDouble();

        System.out.println("KDV'siz fiyati:" + paradegeri);

        boolean kdvDurum=(0<paradegeri)&&(1000>paradegeri);
        double KDV=kdvDurum?0.18:0.08;

        System.out.println("KDV Orani:" + KDV);

        double KDVtutari = paradegeri*KDV;
        System.out.println("KDV tutari:" + KDVtutari);

        double KDVli= paradegeri+ (KDVtutari);
        System.out.print("KDV'li fiyati:" + KDVli);


    }

}
