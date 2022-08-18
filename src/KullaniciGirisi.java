
import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, newPassword, sifrelendirme;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanici Adiniz:");
        userName = inp.nextLine();

        System.out.print("Sifreniz:");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giris yaptiniz.");
        } else {
            System.out.println("Yanlis sifre girdiniz. Sifreniz sifirlanmasini isterseniz  \"yes\" ,ayni sifreyle devam  etmek için \"no\" yu seciniz.");
            sifrelendirme = inp.nextLine();

            if (sifrelendirme.equals("yes")) {

                System.out.print("Yeni sifrenizi giriniz:");
                newPassword = inp.nextLine();
                password = newPassword;

                if (password.equals("java123")) {
                    System.out.print("Sifre oluşturulamadı, lütfen başka şifre giriniz");
                } else {
                    System.out.print("Sifre olusturuldu.");

                }


            } else {
                System.out.println(" hatali secim yaptiniz.");

            }


        }
    }
}


