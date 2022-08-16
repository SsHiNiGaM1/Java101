import java.util.Scanner;


public class ManavKasaProg {
    public static void main(String[] args) {

        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5;

        System.out.print("Armut Kac Kilo ? :");
        Scanner input1 =new Scanner(System.in);
        double a= input1.nextDouble();

        System.out.print("Elma Kac Kilo ? :");
        Scanner input2 =new Scanner(System.in);
        double e= input2.nextDouble();

        System.out.print("Domates Kac Kilo ? :");
        Scanner input3 =new Scanner(System.in);
        double d= input3.nextDouble();

        System.out.print("Muz Kac Kilo ? :");
        Scanner input4 =new Scanner(System.in);
        double m= input4.nextDouble();

        System.out.print("Patlican Kac Kilo ? :");
        Scanner input5 =new Scanner(System.in);
        double p= input5.nextDouble();

        double total= armut*a+elma*e+domates*d+muz*m+patlican*p;
        System.out.println("Toplam Tutar: " + total+ " TL");


    }
}
