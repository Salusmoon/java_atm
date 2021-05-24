package main;
import musteri.*;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;


public class main {


    public static void main(String[] args) {

        boolean hesapcheck = false;

        // customer create and list in arraylist
        ArrayList<Musteri> musteriArray = new ArrayList<Musteri>();

        bireyselMusteri musteri1 = new bireyselMusteri(001, "Ali Veli", "ev1", 1000, 1);
        musteriArray.add(musteri1);
        bireyselMusteri musteri2 = new bireyselMusteri(002, "Adem K", "ev2", 3000, 2);
        musteriArray.add(musteri2);
        bireyselMusteri musteri3 = new bireyselMusteri(003, "Berkcan E", "ev3", 10, 3);
        musteriArray.add(musteri3);
        kurumsalMusteri musteri4 = new kurumsalMusteri(004, "Kadir K ", "Testinium", 2500, 4);
        musteriArray.add(musteri4);
        kurumsalMusteri musteri5 = new kurumsalMusteri(005, "Furkan B", "ABC", 4000, 5);
        musteriArray.add(musteri5);


        // customer list HesapNo-Customer info
        Hashtable<Integer, Musteri> musteriList = new Hashtable();

        for (int i = 0; i < musteriArray.size(); i++) {
            musteriList.put(musteriArray.get(i).getHesapNo(), musteriArray.get(i));

        }

        Musteri currentMusteri = null;
        while(hesapcheck!=true) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Hesap No giriniz");
                int hesapno = scan.nextInt();
                System.out.println(hesapno + " Hesap no aranıyor ");
                if (musteriList.containsKey(hesapno)) {
                    System.out.println("Hesaba giriş yapılıyor");
                    hesapcheck =true;
                    currentMusteri = musteriList.get(hesapno);

                } else {
                    System.out.println("Hesap no bulunamadı");
                    currentMusteri = null;
                }
            } catch (Exception e) {
                System.out.println("Hesap numarası yanlış girildi");
            }
        }

        System.out.println("Hesap no: " + currentMusteri.getHesapNo());
        if (currentMusteri.getClass() == bireyselMusteri.class) {
            System.out.println("TC: " + ((bireyselMusteri) currentMusteri).getTC());
            System.out.println("Ad Soyad: " + ((bireyselMusteri) currentMusteri).getAdSoyad());
            System.out.println("Ev Aderesi: " + ((bireyselMusteri) currentMusteri).getEvAdresi());
            System.out.println("Hesap bakiyesi: " + ((bireyselMusteri) currentMusteri).getHesapBakiyesi());
            int islemNo = 0;
            while(islemNo !=3){
                try{
                    Scanner scan = new Scanner(System.in);
                    System.out.println("İşlem seçiniz : ");
                    System.out.println("1 : para yatırma 2: para çekme 3: çıkış");
                    islemNo = scan.nextInt();
                    if(islemNo == 1){
                        Scanner scan1 = new Scanner(System.in);
                        System.out.println("Yatırlacak parayı yazın");
                        int para = scan1.nextInt();
                        int hesapPara= ((bireyselMusteri) currentMusteri).getHesapBakiyesi();
                        int newHesapPara= hesapPara+para;
                        ((bireyselMusteri) currentMusteri).setHesapBakiyesi(newHesapPara);
                        System.out.println("Hesap bakiyesi " + ((bireyselMusteri) currentMusteri).getHesapBakiyesi());
                    }else if (islemNo == 2){
                        Scanner scan1 = new Scanner(System.in);
                        System.out.println("Yatırlacak parayı yazın");
                        int para = scan1.nextInt();
                        int hesapPara= ((bireyselMusteri) currentMusteri).getHesapBakiyesi();
                        if (para>hesapPara){
                            System.out.println("İstenilen para hesapta bulunmamaktadır");
                        }else{
                            int newHesapPara= hesapPara-para;
                            ((bireyselMusteri) currentMusteri).setHesapBakiyesi(newHesapPara);
                            System.out.println("Hesap bakiyesi: " + ((bireyselMusteri) currentMusteri).getHesapBakiyesi());
                        }
                    }else if (islemNo == 3){
                        System.out.println("Çıkış işlemi yapıldı");
                    }
                }catch (Exception e){
                    System.out.println("işlem yanlış seçildi");
                }
            }
        }else{
            System.out.println("TC: " + ((kurumsalMusteri) currentMusteri).getTC());
            System.out.println("Ad Soyad: " + ((kurumsalMusteri) currentMusteri).getAdSoyad());
            System.out.println("Şirket Adı: " + ((kurumsalMusteri) currentMusteri).getSirketAdı());
            System.out.println("Hesap bakiyesi: " + ((kurumsalMusteri) currentMusteri).getHesapBakiyesi());
            int islemNo = 0;
            while(islemNo !=3){
                try{
                    Scanner scan = new Scanner(System.in);
                    System.out.println("İşlem seçiniz : ");
                    System.out.println("1 : para yatırma 2: para çekme 3: çıkış");
                    islemNo = scan.nextInt();
                    if(islemNo == 1){
                        Scanner scan1 = new Scanner(System.in);
                        System.out.println("Yatırlacak parayı yazın");
                        int para = scan1.nextInt();
                        int hesapPara= ((kurumsalMusteri) currentMusteri).getHesapBakiyesi();
                        int newHesapPara= hesapPara+para;
                        ((kurumsalMusteri) currentMusteri).setHesapBakiyesi(newHesapPara);
                        System.out.println("Hesap bakiyesi: " + ((kurumsalMusteri) currentMusteri).getHesapBakiyesi());
                    }else if (islemNo == 2){
                        Scanner scan1 = new Scanner(System.in);
                        System.out.println("Yatırlacak parayı yazın");
                        int para = scan1.nextInt();
                        int hesapPara= ((kurumsalMusteri) currentMusteri).getHesapBakiyesi();
                        if (para>hesapPara){
                            System.out.println("İstenilen para hesapta bulunmamaktadır");
                        }else{
                            int newHesapPara= hesapPara-para;
                            ((kurumsalMusteri) currentMusteri).setHesapBakiyesi(newHesapPara);
                            System.out.println("Hesap bakiyesi: " + ((kurumsalMusteri) currentMusteri).getHesapBakiyesi());
                        }
                    }else if (islemNo == 3){
                        System.out.println("Çıkış işlemi yapıldı");
                    }
                }catch (Exception e){
                    System.out.println("işlem yanlış seçildi");
                }
            }
        }
    }
}
