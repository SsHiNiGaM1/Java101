import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = scan.nextInt();
        int tempNumber = number;
        int basValue;
        int result = 0;
        

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            result+=basValue;
            tempNumber /= 10;
            
        }

        tempNumber = number;
       
      
            System.out.println(number + " Basamak sayılarının toplamı:"+ result);
        

    }

}

   