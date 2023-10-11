package segitiga.luar;
import java.util.Scanner;
public class SegitigaLuar {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Segitiga Angka");
    System.out.print("Masukkan Bilangan = ");
    int x = s.nextInt();
    for(int a = 1; a <= x; a++){
        for(int b = 1; b <= a; b++){
            System.out.print(b+" ");
        }
        System.out.println("");
    }
    }
    
}
