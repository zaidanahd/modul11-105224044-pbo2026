class AkunBank {
    private String nomorRekening;
    private double saldo;
    private double totalTransferHariIni;
    private final double limit_tf_harian = 10000000 ;

    public AkunBank(String nomorRekening, double saldo, double totalTransferHariIni){
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
        this.totalTransferHariIni = 0;
    }

    public void tarikTunai(double nominal) throws SaldoTidakMencukupiException{
        if(nominal > this.saldo){
            double kurang = nominal - this.saldo;
            throw new SaldoTidakMencukupiException(kurang); 
        }

        this.saldo -= nominal;
        System.out.println("transaksi berhasil: Rp" + nominal + "sisa saldo: Rp" + this.saldo);
    } 

    public void transfer(AkunBank tujuan, double nominal) throws SaldoTidakMencukupiException, BatasTransferHarianException {
        if (this.totalTransferHariIni + nominal > limit_tf_harian) {
            throw new BatasTransferHarianException(limit_tf_harian);
        }
        if (nominal > this.saldo) {
            double kurang = nominal - this.saldo;
            throw new SaldoTidakMencukupiException(kurang);
        }
        this.saldo -= nominal;
        this.totalTransferHariIni += nominal;
        tujuan.terimaTransfer(nominal);

        System.out.println("Berhasil transfer Rp " + String.format("%,.0f", nominal) + " ke rekening " + tujuan.getNomorRekening());
        System.out.println("Sisa saldo Anda: Rp " + String.format("%,.0f", this.saldo));
    }

    public void terimaTransfer(double nominal){
        this.saldo += nominal;
    }

    public String getNomorRekening(){
        return nomorRekening;
    }

    public double getSaldo(){
        return saldo;
    }
}
