import java.util.Scanner;
public class DortveBesinKuvveti {
    public static void main(String[] args){
       
Scanner scan = new Scanner(System.in);
System.out.print("Bir sayı giriniz:");
int m=scan.nextInt();
    

for(int i=1;i<=m;i*=4)
    {
        System.out.println(i+",");
    }
    System.out.println("-------------------------");
    for(int i=1;i<=m;i*=5)
    {
        System.out.println(i+",");
    }



    }
}
