public class MesinKasir {
    public void bayar(int totalBelanja, int uangDiberikan) throws UangKurangException {
        if (uangDiberikan < totalBelanja) {
            throw new UangKurangException("Uang yang diberikan kurang!");
        }
    }

    public void cetakStruk(boolean statusPrinter) throws Exception {
        if (statusPrinter == false) {
            throw new Exception("Printer error: Kertas struk sudah habis!");
        }
    }
}
