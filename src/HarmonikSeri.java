import java.util.Scanner;
public class HarmonikSeri {
    public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
System.out.print("N sayısını giriniz:");
double n= scan.nextDouble();
double toplam=0;
for(double i=1; i<=n;i++)
{
toplam=toplam+1/i;
}
System.out.println("Harmonik Seri sonucu:"+ toplam);
    }
}
