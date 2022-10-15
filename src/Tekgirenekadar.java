import java.util.Scanner;

public class Tekgirenekadar {
    public static void main(String[] args){
    
        int n;
        int toplam=0;

        do{
            Scanner scan= new Scanner(System.in);
            System.out.print("Bir sayı giriniz:");
            n= scan.nextInt();
            
             if(n%4==0){
                toplam=toplam+n;
             }
        }
        while(n%2==0);

        System.out.println("Toplam:"+toplam);
    }

}
