import java.util.Scanner;

public class UcveDort {
    public static void main(String[] args){

        Scanner scan =new Scanner(System.in);
     
        int toplam=0;
        int k;
    System.out.print("Sayı giriniz:");

        for(int i=0;i<=k;i++)
        {
            int x;
            if (i%3==0 && i%4==0)
            {
              toplam=toplam+i;
                 
                 x++;
            }
            double ort=toplam/x;
        }

        
        System.out.print("Ortalama: "+ ort);

    }
}





    
