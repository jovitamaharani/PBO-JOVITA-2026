package BikeDemo;

public class WadahAir {
    private String bahan;
    private int kapasitasLiter;

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitasLiter = kapasitas;
    }

    public void cetakInformasi() {
        System.out.println("Bahan          : " + bahan);
        System.out.println("Kapasitas      : " + kapasitasLiter + " Liter");
    }
}