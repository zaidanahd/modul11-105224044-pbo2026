class Pelanggan {
    private String nama;
    private int Umur;

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

    public void daftarmember(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'daftarmember'");
    }

    public void pesanKopi(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pesanKopi'");
    }
}
