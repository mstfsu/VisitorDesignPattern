import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Hasta hasan = new Hasta("Hasan", "Covid", "Öldü");
        Hasta mehmet = new Hasta("Mehmet", "Covid", "Öldü");
        Hasta ali = new Hasta("Ali", "Covid", "İyileşti");

        Hastane kayseriHastanesi = new Hastane("Kayseri hastanesi");
        Hastane sivasHastanesi = new Hastane("Sivas hastanesi");

        İl istanbul = new İl("İstanbul");
        İl sivas = new İl("Sivas");

        Ulke turkiye = new Ulke("Türkiye");

        turkiye.ilEkle(istanbul);
        turkiye.ilEkle(sivas);

        istanbul.hastaneEkle(kayseriHastanesi);
        istanbul.hastaneEkle(sivasHastanesi);

        kayseriHastanesi.hastaEkle(hasan);
        kayseriHastanesi.hastaEkle(mehmet);
        kayseriHastanesi.hastaEkle(ali);

        CovidHastaSayısıVisitor covidHastaSayısıVisitor = new CovidHastaSayısıVisitor();
        CovidÖlenHastaSayısıVisitor covidÖlenHastaSayısıVisitor = new CovidÖlenHastaSayısıVisitor();
        System.out.println("Kayseri hastanesindeki Covid hasta sayısı :" + kayseriHastanesi.accept(covidHastaSayısıVisitor));
        System.out.println("Türkiyedeki Covid hasta sayısı :" + turkiye.accept(covidHastaSayısıVisitor));
        System.out.println("İStanbuldaki Covid hasta sayısı :" + istanbul.accept(covidHastaSayısıVisitor));
        System.out.println("Kayseri Ölen Covid hasta sayısı :" + kayseriHastanesi.accept(covidÖlenHastaSayısıVisitor));


        ArrayList<Element> elementListesi = new ArrayList<>();
        elementListesi.add(istanbul);
        elementListesi.add(turkiye);
        for (Element element : elementListesi) {
            System.out.println(element.getAdi() + element.accept(covidHastaSayısıVisitor));
        }
    }

}
