import java.util.List;

public class CovidÖlenHastaSayısıVisitor implements Visitor{
    @Override
    public int visitHastane(Hastane hastane) {
        return HastaSayisiHesapla(hastane);
    }

    @Override
    public int visitİl(İl i̇l) {
        return HastaSayisiHesapla(i̇l);
    }

    @Override
    public int visitUlke(Ulke ulke) {
        return HastaSayisiHesapla(ulke);
    }

    public int HastaSayisiHesapla(Ulke ulke){
        List<İl> ilListesi= ulke.getIller();
        int hastaSayisi=0;
        for (İl il: ilListesi){
            hastaSayisi += HastaSayisiHesapla(il);
        }
        return hastaSayisi;
    }

    public int HastaSayisiHesapla(İl i̇l){
        List<Hastane> hastaneListesi= i̇l.getHastaneler();
        int hastaSayisi=0;
        for (Hastane hastane:hastaneListesi){
            hastaSayisi += HastaSayisiHesapla(hastane);
        }
        return hastaSayisi;
    }


    public int HastaSayisiHesapla(Hastane hs){
        List<Hasta> hastaListesi=hs.getHastalar();
        int hastaSayisi=0;
        for (Hasta hasta:hastaListesi){
            if(hasta.getHastalik().equals("Covid")&&hasta.getDurumu().equals("Öldü")){
                hastaSayisi++;
            }
        }
        return hastaSayisi;
    }
}
