import java.util.Scanner;

public class Ucgen {

    public static void main(String[] args) {

        int a,b,c,u;


        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen 1. kenar uzunlugunu giriniz:");
        a= scan.nextInt();

        System.out.print("Lutfen 2. kenar uzunlugunu giriniz:");
        b=scan.nextInt();

        System.out.print("Lutfen 3. kenar uzunlugunu giriniz:");
        c= scan.nextInt();

        u=(a+b+c)/2;

        double Alan= Math.sqrt((u*(u-a)*(u-b)*(u-c)));

        System.out.println("Ucgenin alani:"+ Alan);



    }
}
