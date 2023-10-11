package ganjil.genap.pkgdo.pkgwhile;
import java.util.Scanner;
public class GanjilGenapDoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, y;
        System.out.println("Program ganjil genap do while");
        System.out.print("Masukkan angka = ");
        x = s.nextInt();
        y = x;
        do {
            if (x % 2==0){
                System.out.println(x+ " Adalah Bilangan Genap");
            } else {
                System.out.println(x+" Adalah Bilangan Ganjil");
                
            }
            x++;
        } while (x <= y);
    }
    
}
