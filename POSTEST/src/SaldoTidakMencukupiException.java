class SaldoTidakMencukupiException extends Exception {
    private double kekuranganSaldo;

    public SaldoTidakMencukupiException(double kekuranganSaldo) {
        super("Transaksi Gagal: Saldo Anda tidak mencukupi.");
        this.kekuranganSaldo = kekuranganSaldo;
    }

    public double getKekuranganSaldo() {
        return kekuranganSaldo;
    }
}