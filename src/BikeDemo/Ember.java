package BikeDemo;

public class Ember extends WadahAir {
    private String warna;
    private boolean adaGagang;

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setAdaGagang(boolean adaGagang) {
        this.adaGagang = adaGagang;
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Warna Ember    : " + warna);
        System.out.println("Ada Gagang     : " + (adaGagang ? "Ya" : "Tidak"));
        System.out.println("Tipe           : Ember");
    }
}
