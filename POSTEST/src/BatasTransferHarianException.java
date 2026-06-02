class BatasTransferHarianException extends Exception {
    public BatasTransferHarianException(double limit) {
        super("Transaksi Gagal: Total transfer hari ini melebihi batas harian (Limit: Rp " + String.format("%,.0f", limit) + ").");
    }
}