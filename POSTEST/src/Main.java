public class Main {
    public static void main(String[] args) {
       
        AkunBank nasabah = new AkunBank("1912051219", 5000000.0, 0); // Saldo awal 5 Juta
        AkunBank tujuan = new AkunBank("2005191212", 1000000.0, 0);

        System.out.println("=== SIMULASI ATM DIGITAL ===");
        System.out.println("Nomor Rekening: " + nasabah.getNomorRekening());
        System.out.println("Saldo Awal: Rp " + String.format("%,.0f", nasabah.getSaldo()));

        try {
            System.out.println("Coba Tarik Tunai Rp 2.000.000");
            nasabah.tarikTunai(2000000.0);
            System.out.println();

            System.out.println("Coba Tarik Tunai Rp 4.000.000 (Melebihi sisa saldo)");
            nasabah.tarikTunai(4000000.0); 
            System.out.println();

            System.out.println("Coba Transfer Rp 11.000.000 (Melebihi limit harian)");
            nasabah.transfer(tujuan, 11000000.0);
            System.out.println();

        } catch (SaldoTidakMencukupiException e) {
            System.out.println(e.getMessage());
            System.out.println("Kekurangan Saldo Sebesar: Rp " + String.format("%,.0f", e.getKekuranganSaldo()));
        } catch (BatasTransferHarianException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan sistem: " + e.getMessage());
        } finally {
            System.out.println("Sesi transaksi ATM Anda telah diakhiri. Kartu dikeluarkan otomatis.");
            System.out.println("================================================");
        }
    }
}