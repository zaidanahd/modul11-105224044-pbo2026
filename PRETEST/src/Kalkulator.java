import java.util.InputMismatchException;
import java.util.Scanner;

public class Kalkulator {
    public double bagi(double pembilang, double penyebut) {
        if (penyebut == 0) {
            throw new ArithmeticException("gabisa melakukan pembagian dengan nol.");
        }
        return pembilang / penyebut;
    }

    public class Main {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       Kalkulator kalkulator = new Kalkulator();
    try{
        System.out.print("Masukkan angka pertama (pembilang): ");
            double pembilang = scanner.nextDouble(); 

            System.out.print("Masukkan angka kedua (penyebut): ");
            double penyebut = scanner.nextDouble();

            double hasil = kalkulator.bagi(pembilang, penyebut);
            System.out.println("Hasil pembagian: " + hasil);
        } catch (InputMismatchException e) {
            System.err.println("Error: Input wajib angka bulat/desimal");
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Proses kalkulasi selesai dan resource memori telah di bersihkan!");
        }
    }
}
}