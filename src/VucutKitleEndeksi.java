import java.util.Scanner;


public class VucutKitleEndeksi {
    public static void main(String[] args) {

        double boy, kilo, vke;

        System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz : ");
        Scanner scan =new Scanner(System.in);
        boy= scan.nextDouble();


        System.out.print("Lutfen kilonuzu giriniz :");
        Scanner input =new Scanner(System.in);
        kilo= input.nextDouble();

        vke= kilo/(boy*boy);

        System.out.println("Vucut Kitle Indeksiniz:"+ vke);





    }
}

