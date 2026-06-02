import java.util.InputMismatchException;
import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] hargaMenu = new int[3]; 

        System.out.println(" INPUT HARGA MENU ");
 
        for (int i = 0; i < 4; i++) {
            try {
                System.out.print("Masukkan harga menu ke-" + (i + 1) + ": ");
                hargaMenu[i] = scanner.nextInt(); 
                System.out.println("Harga berhasil disimpan."); 
            } catch (InputMismatchException e) {
                System.out.println("Error: Input harga harus berupa angka!"); 
                scanner.next();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Kapasitas memori harga sudah penuh!");
            } finally {
                System.out.println("program selesai!");
            }
        }
    }
}