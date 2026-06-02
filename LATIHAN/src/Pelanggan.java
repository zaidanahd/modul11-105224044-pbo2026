class Pelanggan {
    private String nama;
    private int Umur;
    private int stokKopi; 

    Pelanggan() {
        this.stokKopi = 5; 
    }

     public int getStokKopi() {
        return stokKopi;
    }

    public void pesanKopi(int jumlahPesanan) {
        if (jumlahPesanan > stokKopi) {
            throw new KopiHabisException("Maaf, stok kopi habis!");
        } else {
            stokKopi -= jumlahPesanan;
        }
    }

    public String getnama(){
        return nama;
    }

    public void setnama(String nama){
        this.nama = nama;
    }

    public int getUmur(){
        return Umur;
    }

    public void daftarMember(){
        if(Umur < 17){
            throw new IllegalArgumentException ("Maaf, umur Anda belum mencukupi untuk menjadi Member VIP");
        } else {
            this.Umur = Umur;
        }
    }
}
