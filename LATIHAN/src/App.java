public class App {
    public static void main(String[] args) throws Exception {
       try { //buat no 2
            Pelanggan plg1 = new Pelanggan();
            plg1.daftarMember();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try{ //buat no 3
            Pelanggan plg2 = new Pelanggan();
            plg2.pesanKopi(10);
        } catch (KopiHabisException e) {
            System.out.println(e.getMessage());
        }

        try{ //buat no 4
            MesinKasir mk1 = new MesinKasir();
            mk1.bayar(50000, 30000);
        } catch (UangKurangException e){
            System.out.println(e.getMessage());
        }

        try{ //buat no 5
            MesinKasir mk2 = new MesinKasir();
            mk2.cetakStruk(false);
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Terima kasih telah berkunjung ke Cafe Java Bean. Program kasir ditutup");
        }
    }
}
