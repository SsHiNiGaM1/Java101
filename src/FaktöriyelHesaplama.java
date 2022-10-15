import java.util.Scanner;

public class FaktöriyelHesaplama 
{
    public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
System.out.print("Bir n değeri giriniz:");
int n= scan.nextInt();
int nfaktöriyel=1;
System.out.print("Bir r değeri giriniz:");
int r= scan.nextInt();
int rfaktöriyel=1;
int farkfaktöriyel=1;

for(int i=1;i<=n;i++)
{
    nfaktöriyel=nfaktöriyel*i;
    System.out.println(nfaktöriyel);
}
System.out.println("-------------");
for(int m=1;m<=r;m++)
{
    rfaktöriyel=rfaktöriyel*m;
    System.out.println(rfaktöriyel);
}
System.out.println("-------------");
for(int x=1;x<=(n-r);x++)
{
    farkfaktöriyel=farkfaktöriyel*x;
    System.out.println(farkfaktöriyel);
}
       
int Kombinasyon= nfaktöriyel/(rfaktöriyel*(farkfaktöriyel));
System.out.println("Kombinasyonun sonucu:"+ Kombinasyon);
    }
    
}
