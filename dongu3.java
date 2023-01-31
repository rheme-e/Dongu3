package Giris;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class dongu3 {
    public static void main(String[] args) {
        int k,top=0;
        Scanner inp=new Scanner(System.in);
        do{
            System.out.println("Sayı Değeri Giriniz:");
            k=inp.nextInt();
            if(k%4==0){
                top+=k;
            }
        }while(k%2 == 0);
        System.out.println("Toplam:"+top);
    }
}
