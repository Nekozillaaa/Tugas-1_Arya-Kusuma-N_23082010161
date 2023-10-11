package ganjil.genap.pkgwhile;
import java.util.Scanner;
public class GanjilGenapWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, y;
        System.out.println("Program ganjnil genap");
        System.out.print("masukkan bilangan : ");
        x = s.nextInt();
        y = x;
        while (x <= y){
            if (x % 2==0){
                System.out.println(x+ " Adalah Bilangan Genap");
            } else {
                System.out.println(x+" Adalah Bilangan Ganjil");
                
            }
            x++;
        }
                
                
    }
    
}
