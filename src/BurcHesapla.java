import java.util.Scanner;


public class BurcHesapla{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
int month, day;

System.out.print("Dogdugunuz ay: ");

month= scan.nextInt();

System.out.print("Dogdugunuz gun: ");

day= scan.nextInt();

if(month==1)
{
    if (day<22)
    {
        System.out.print("Oglak Burcu");

    }
    else {
        System.out.print("Kova Burcu");
    }
    
}
if(month==2)
{
    if (day<22)
    {
        System.out.print("Kova Burcu");

    }
    else {
        System.out.print("Balık Burcu");
    }
}
if(month==3)
{
    if (day<22)
    {
        System.out.print("Balık Burcu");

    }
    else {
        System.out.print("Koc Burcu");
    }
}
if(month==4)
{
    if (day<22)
    {
        System.out.print("Koc Burcu");

    }
    else {
        System.out.print("Boga Burcu");
    }
}
if(month==5)
{
    if (day<22)
    {
        System.out.print("Boga Burcu");

    }
    else {
        System.out.print("Ikizler Burcu");
    }
}
if(month==6)
{
    if (day<22)
    {
        System.out.print("Ikizler Burcu");

    }
    else {
        System.out.print("Yengec Burcu");
    }
}
if(month==7)
{
    if (day<22)
 {
        System.out.print("Yengec Burcu");

    }
    else {
        System.out.print("Aslan Burcu");
    }
}
if(month==8)
{
    if (day<22)
    {
        System.out.print("Aslan Burcu");

    }
    else {
        System.out.print("Basak Burcu");
    }
}
if(month==9)
{
    if (day<22)
    {
        System.out.print("Basak Burcu");

    }
    else {
        System.out.print("Terazi Burcu");
    }
}
if(month==10)
{
    if (day<22)
    {
        System.out.print("Terazi Burcu");

    }
    else {
        System.out.print("Akrep Burcu");
    }
}
if(month==11)
{
    if (day<22)
    {
        System.out.print("Akrep Burcu");

    }
    else {
        System.out.print("Yay Burcu");
    }
}
if(month==12)
{
    if (day<22)
    {
        System.out.print("Yay Burcu");

    }
    else {
        System.out.print("Oglak Burcu");
    }


   
}
    
if ( month>12 || day>31)
{
    
        System.out.print("Hatalı giris yaptınız.");
        
}

}

}


