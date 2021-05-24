package musteri;

public class kurumsalMusteri extends Musteri{

    private int TC;
    private String adSoyad;
    private String sirketAdı;
    private int hesapBakiyesi;

    public kurumsalMusteri(int TC, String adSoyad, String sirketAdı, int hesapBakiyesi, int hesapNo) {
        this.TC = TC;
        this.adSoyad = adSoyad;
        this.sirketAdı = sirketAdı;
        this.hesapBakiyesi = hesapBakiyesi;
        super.hesapNo= hesapNo;
    }

    public int getTC() {
        return TC;
    }

    public void setTC(int TC) {
        this.TC = TC;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getSirketAdı() {
        return sirketAdı;
    }

    public void setSirketAdı(String sirketAdı) {
        this.sirketAdı = sirketAdı;
    }

    public int getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(int hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }
}
