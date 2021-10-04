public class Hasta {
    private String adi;
    private  String  hastalik;
    private String durumu;

    public Hasta(String adi, String  hastalik, String  durumu) {
        this.adi = adi;
        this.hastalik = hastalik;
        this.durumu = durumu;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String  getHastalik() {
        return hastalik;
    }

    public void setHastalik(String  hastalik) {
        this.hastalik = hastalik;
    }

    public String  getDurumu() {
        return durumu;
    }

    public void setDurumu(String durumu) {
        this.durumu = durumu;
    }
}
