public class TiketHabisException extends Exception {
    private String namaKereta;
    private int SisaKursi;

    public TiketHabisException(String namaKereta, String message, int SisaKursi) {
        super(message);
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
