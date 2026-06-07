import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExpressApp {
    public static void main(String[] mainArgs) {
        ReservasiKontrol kontrol = new ReservasiKontrol();
        Scanner scanner = new Scanner(System.in);
        boolean berjalan = true;

            System.out.println("  SELAMAT DATANG DI JAVA EXPRESS CLI ");

            while (berjalan) { 
                System.out.println("\n MENU UTAMA ");
                System.out.println("1. Lihat Jadwal Kereta");
                System.out.println("2. Pesan Tiket");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu (1-3): ");

                try { 
                    int menu = scanner.nextInt(); 
                    scanner.nextLine(); 

                    switch (menu) {
                        case 1:
                            System.out.println(" JADWAL KERETA JAVA EXPRESS ");
                            System.out.printf("%-6s %-15s %-12s %-10s\n", "KODE", "NAMA", "RUTE", "SISA KURSI");
                            for (Kereta k : kontrol.getDaftarKereta()) {
                                System.out.printf("%-6s %-15s %-12s %-10d\n", 
                                    k.getKodeKereta(), k.getNamaKereta(), k.getRute(), k.getSisaKursi());
                            }
                            break;

                        case 2:
                            System.out.println("\n=== FORMULIR PEMESANAN ===");
                            System.out.print("Masukkan Kode Kereta: ");
                            String kode = scanner.nextLine();
                            System.out.print("Masukkan NIK : ");
                            String nik = scanner.nextLine();
                            System.out.print("Masukkan Nama : ");
                            String nama = scanner.nextLine();
                            System.out.print("Jumlah Tiket : ");
                            int jumlah = scanner.nextInt(); 
                            scanner.nextLine(); 

                            kontrol.pesanTiket(kode, nik, nama, jumlah);
                            break;

                        case 3:
                            berjalan = false;
                            break;

                        default:
                            System.out.println("Pilihan tidak tersedia. Silakan pilih 1-3.");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Error: Input harus berupa angka!"); 
                    scanner.nextLine(); 
                } catch (DataPenumpangTidakValidException e) { 
                    System.out.println(e.getMessage()); 
                } catch (RuteTidakDitemukanException e) { 
                    System.out.println(e.getMessage()); 
                } catch (TiketHabisException e) { 
                    System.out.println(e.getMessage());
                    System.out.println("Info: Kereta " + e.getNamaKereta() + " hanya tersisa " + e.getSisaKursi() + " kursi."); 
                } finally {
                    if (!berjalan) { 
                        System.out.println("\nTerima kasih telah menggunakan layanan JAVA EXPRESS!"); 
                        scanner.close();
                    }
                }
            }
        }
    }