package ganjil.genap.pkgfor;
import java.util.Scanner;
public class GanjilGenapFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        System.out.println("Program Ganjil Genap For");
        System.out.print("Masukkan Angka = ");
        x = s.nextInt();
        for (int i = x ;i <= x; i++) {
            if (x % 2 == 0) {
                System.out.println(x + " adalah angka genap");
            } else {
                System.out.println(x + " adalah angka ganjil");
            }
        }
    }}

    

