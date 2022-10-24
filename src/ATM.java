
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        int right=3;
        int balance=1500;
        String UserName, Password;
        Scanner scan=new Scanner(System.in);

    System.out.print("Kullanıcı adınız:");
    UserName= scan.nextLine();
    System.out.print("Şifreniz:");
    Password=scan.nextLine();
    if (UserName.equals("Shinigami")&&Password.equals("12345"))
    {
        System.out.print("Merhaba Kodluyoruz bankasına hoşgeldiniz.");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
        System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
        int islem=scan.nextInt();
           
        switch(islem){
            case 1:
            System.out.print("Para miktarı:");
            int price= scan.nextInt();
            balance+=price;
            System.out.print("Bakiyeniz "+balance);
            break;

            case 2:
            System.out.print("Para miktarı:");
            price= scan.nextInt();
            if (price > balance) {
                System.out.println("Bakiye yetersiz.");
            } else {
                balance -= price;
                System.out.print("Bakiyeniz "+balance);
            }
            break;

            case 3: 
            System.out.print("Bakiyeniz:"+ balance);
            break;

            case 4:
            System.out.println("Tekrar görüşmek üzere.");
            break;

           }

           }
    
    else {
        right--;
        System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
        if ( right==0){
            System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
        }
    }
}
       

        
}

    

