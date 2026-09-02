package BikeDemo;

public class BarangDemo {
    public static void main(String[] args) {
        Ember emberCuci = new Ember();
        Galon galonAqua = new Galon();
        BotolMinum botolSaya = new BotolMinum();
        TasRansel tasSekolah = new TasRansel();

        emberCuci.setBahan("Plastik PVC");
        emberCuci.setKapasitas(15);
        emberCuci.setWarna("Merah");
        emberCuci.setAdaGagang(true);
        System.out.println("=== INFO EMBER ===");
        emberCuci.cetakInformasi();
        System.out.println();

        galonAqua.setBahan("Polycarbonate");
        galonAqua.setKapasitas(19);
        galonAqua.setMerkAir("Aqua");
        galonAqua.pasangSegel();
        System.out.println("=== INFO GALON ===");
        galonAqua.cetakInformasi();
        System.out.println();

        botolSaya.setBahan("Stainless Steel");
        botolSaya.setKapasitas(1);
        botolSaya.setWarna("Hitam");
        botolSaya.setAdaSedotan(true);
        System.out.println("=== INFO BOTOL MINUM ===");
        botolSaya.cetakInformasi();
        System.out.println();

        tasSekolah.setMerk("Eiger");
        tasSekolah.setJumlahKompartemen(4);
        System.out.println("=== INFO TAS RANSEL ===");
        tasSekolah.cetakInformasi();
    }
}
