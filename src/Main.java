import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int mat,fizik,turkce,kimya,muzik;
       double toplam=0;
       int sayi=5;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz:");
        mat= scanner.nextInt();
        if(mat>=0 && mat <=100){
            toplam+=mat;
      }else {sayi-=1;}
        System.out.println("fizik notunuzu giriniz:");
        fizik= scanner.nextInt();
        if(fizik>=0 && fizik <=100){
            toplam+=fizik;
        }else {sayi-=1;}
        System.out.println("turkce notunuzu giriniz:");
        turkce= scanner.nextInt();
        if(turkce>=0 && turkce <=100){
            toplam+=turkce;
        }else {sayi-=1;}
        System.out.println("Kimya notunuzu giriniz:");
        kimya= scanner.nextInt();
        if(kimya>=0 && kimya <=100){
            toplam+=kimya;
        }else {sayi-=1;}
        System.out.println("Müzik notunuzu giriniz:");
        muzik= scanner.nextInt();
        if(muzik>=0 && muzik <=100){
            toplam+=muzik;
        }else {sayi-=1;}

        double average=toplam/sayi;
        if(average>=55){System.out.println("Geçtiniz\n"+average);}
        else System.out.println("Geçemediniz");





    }
}