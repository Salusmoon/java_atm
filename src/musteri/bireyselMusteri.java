package musteri;

public class bireyselMusteri extends Musteri {

    private int TC;
    private String adSoyad;
    private String evAdresi;
    private int hesapBakiyesi;

    public bireyselMusteri(int TC, String adSoyad, String evAdresi, int hesapBakiyesi, int hesapNo) {
        this.TC = TC;
        this.adSoyad = adSoyad;
        this.evAdresi = evAdresi;
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

    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
    }

    public int getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(int hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }
}
