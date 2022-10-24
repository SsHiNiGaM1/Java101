import java.util.Scanner;
public class YıldızlarileÜcgen {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
    System.out.println("Sayı giriniz:");
    int n = scan.nextInt();
    
    int i;
    for(  i =1; i<= n ; i++)
    {
        for( int k=1;k<=(n-i);k++)
        {
            System.out.print(" ");
        }
        for (int j=1; j<= (2*i-1);j++)
        {
        System.out.print("*");
        }
        System.out.println(" ");
        
    }

    for (i = 1; i < n; i++) {
        for (int b = 1; b <= i; b++) {
            System.out.print(" ");

        }
        for (int c = 1; c <= (2 * n - (2 * i + 1)); c++) {
            System.out.print("*");

        }
        System.out.println(" ");

    }
    }

}
    
    

