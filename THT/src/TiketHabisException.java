public class TiketHabisException extends Exception {
    private String namaKereta;
    private int SisaKursi;

    public TiketHabisException(String namaKereta, String string, int SisaKursi) {
        this.namaKereta = namaKereta;
        this.SisaKursi = SisaKursi;
    }
    
    public String getNamaKereta() {
        return namaKereta;
    }
    
    public int getSisaKursi() {
        return SisaKursi;
    }
}
