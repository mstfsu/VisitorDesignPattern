import java.util.ArrayList;
import java.util.List;

public class Hastane extends Element{
    private List<Hasta> hastalar;

    public Hastane(String adi) {
        super(adi);
        this.hastalar=new ArrayList<>();
    }

    public int accept(Visitor visitor){
        return visitor.visitHastane(this);
    }

    public void hastaEkle(Hasta hasta){
        hastalar.add(hasta);
    }

    public List<Hasta> getHastalar() {
        return hastalar;
    }

    public void setHastalar(List<Hasta> hastalar) {
        this.hastalar = hastalar;
    }
}
