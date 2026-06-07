import java.util.ArrayList;

public class ReservasiKontrol {
    private ArrayList<Kereta> daftarKereta = new ArrayList<>();

    public ReservasiKontrol(){
        daftarKereta.add(new Kereta("K01", "Argo Bromo", "JKT - SBY", 50));
        daftarKereta.add(new Kereta("K02", "Parahyangan", "JKT - BDG", 15));
    }
    public ArrayList<Kereta> getDaftarKereta() {
        return daftarKereta;
    }
    public void pesanTiket(String kode, String nik, String nama, int jumlahTiket) 
        throws RuteTidakDitemukanException, TiketHabisException {
            
    if (nik.length() != 16) {
        throw new DataPenumpangTidakValidException("Error: Panjang NIK harus tepat 16 karakter!");
        }

    if (!nik.matches("[0-9]+")) {
        throw new DataPenumpangTidakValidException("Error: NIK harus berupa angka saja, tidak boleh ada huruf!");
        }
        
    Kereta keretaDipilih = null;
        for (Kereta k : daftarKereta) {
            if (k.getKodeKereta().equalsIgnoreCase(kode)) {
                keretaDipilih = k;
                break;
            }
        }
        if (keretaDipilih == null) { 
            throw new RuteTidakDitemukanException("Error: Kode kereta '" + kode + "' tidak ditemukan."); 
        }
        if (jumlahTiket > keretaDipilih.getSisaKursi()) {
            throw new TiketHabisException("Error: Kursi tidak mencukupi.", keretaDipilih.getNamaKereta(),keretaDipilih.getSisaKursi());
        }

        keretaDipilih.setSisaKursi(keretaDipilih.getSisaKursi() - jumlahTiket);
        System.out.println("\n=== RESERVASI BERHASIL ===");
        System.out.println("Penumpang: " + nama);
        System.out.println("Kereta   : " + keretaDipilih.getNamaKereta());
        System.out.println("Jumlah   : " + jumlahTiket + " tiket");

    }
}
