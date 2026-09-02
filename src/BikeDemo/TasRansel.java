package BikeDemo;

public class TasRansel {
    private String merk;
    private int jumlahKompartemen;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setJumlahKompartemen(int jumlah) {
        this.jumlahKompartemen = jumlah;
    }

    public void cetakInformasi() {
        System.out.println("Merk Tas       : " + merk);
        System.out.println("Kompartemen    : " + jumlahKompartemen + " kantong");
        System.out.println("Tipe           : Tas Ransel");
    }
}