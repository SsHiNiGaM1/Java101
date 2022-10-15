import java.util.Scanner;

public class UcveDort {
    public static void main(String[] args){

        Scanner scan =new Scanner(System.in);
        int toplam=0;
        int k;
        double ort;
        
    System.out.print("Sayı giriniz:");
    k= scan.nextInt();
int x=0;
        for(int i=1;i<=k;i++)
        {
            
            if ((i%3==0) && (i%4==0))
            {
              toplam=toplam+i;
             
                 x++;
                
            }
            
        }
        
        ort =toplam/x;
        
        System.out.print("Ortalama: "+ ort);

    }
}





    
