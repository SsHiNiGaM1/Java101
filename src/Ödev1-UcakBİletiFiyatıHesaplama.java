import java.util.Scanner;


public class UcakBiletiHesaplama{
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
double mesafe, yas, yasindirinoranı,yolculuktipi, gidisdönüsindirimi;


System.out.println("Mesafeyi km türünden giriniz: ");
mesafe= scan.nextInt();

System.out.println("Yasınızı giriniz: ");
yas= scan.nextInt();

System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
yolculuktipi= scan.nextInt();

double normaltutar= mesafe*0.10;

if (mesafe<0 || yas<0 || (yolculuktipi!=1||yolculuktipi!=2))
{
    System.out.println("Hatalı veri girdiniz!");
}

if (yas<12)
{
    yasindirinoranı= 0.15;
}
 if ( 12<yas<24)
    {
          yasindirinoranı=0.10;
    }

    if (yas>65)
    {
      yasindirinoranı=0.30;
    }
 double yasindirimi= normaltutar*yasindirinoranı;

if (yolculuktipi==2)
{
 gidisdönüsindirimi= 0.20;
}

double indirimlitutar= normaltutar-yasindirimi;
double toplamtutar= (indirimlitutar-gidisdönüsindirimi)*2;

System.out.println("Toplam tutar= "+ toplamtutar);

}
}




    
    