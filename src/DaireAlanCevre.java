import java.util.Scanner;


public class DaireAlanCevre {
    public static void main(String[] args) {

        double pi =3.14,a,dilimalani;
        int r;
        System.out.print("Dairenin yari capini giriniz:");
        Scanner scan= new Scanner(System.in);
        r= scan.nextInt();

        System.out.print("Dairenin merkez acisinin olcusunu giriniz:");
        Scanner input= new Scanner(System.in);
        a= input.nextInt();

        dilimalani= (pi*(r*r)*a)/360;

        System.out.println("Daire diliminin alani :"+dilimalani);





    }
    }
