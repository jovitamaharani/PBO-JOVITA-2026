package BikeDemo;

public class BotolMinum extends WadahAir {
    private String warna;
    private boolean adaSedotan;

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setAdaSedotan(boolean adaSedotan) {
        this.adaSedotan = adaSedotan;
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Warna Botol    : " + warna);
        System.out.println("Ada Sedotan    : " + (adaSedotan ? "Ya" : "Tidak"));
        System.out.println("Tipe           : Botol Minum");
    }
}
