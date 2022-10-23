import java.util.Scanner;

public class Uslusayihesaplayanprogram {
    public static void main(String[] args) {
int n,k;
Scanner scan=new Scanner(System.in);
System.out.print("Üssü alınacak sayı:");
n=scan.nextInt();
System.out.print("Üs olacak sayı:");
k=scan.nextInt();
int toplam=1;
for(int x=1;x<=k;x++)
{
    toplam=toplam*n;
}

System.out.println("Sonuç:"+ toplam);
    }
}
