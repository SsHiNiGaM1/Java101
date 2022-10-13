import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args){
    int yıl;

    Scanner scan= new Scanner(System.in);
System.out.print("Yıl giriniz: ");
yıl = scan.nextInt();

if ((yıl%100==0)&&(yıl%400==0))
{
    System.out.println(yıl+ " bir artık yıldır !");
   
}
else if (yıl%4==0)
{
    System.out.println(yıl+ " bir artık yıldır !");
}

else  

System.out.println(yıl+ "bir artık yıl değildir !");

    }
}
