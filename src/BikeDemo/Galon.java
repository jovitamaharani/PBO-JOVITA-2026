package BikeDemo;

public class Galon extends WadahAir {
    private String merkAir;
    private boolean isSealed;

    public void setMerkAir(String merk) {
        this.merkAir = merk;
    }

    public void pasangSegel() {
        this.isSealed = true;
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Merk Air       : " + merkAir);
        System.out.println("Status Segel   : " + (isSealed ? "Tersegel" : "Terbuka"));
        System.out.println("Tipe           : Galon");
    }
}
