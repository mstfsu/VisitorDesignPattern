import java.util.ArrayList;
import java.util.List;

public class İl extends Element{
    private List<Hastane> hastaneler;

    public İl(String adi) {
        super(adi);
        this.hastaneler=new ArrayList<>();
    }

    public int accept(Visitor visitor){
        return visitor.visitİl(this);
    }
    public void hastaneEkle(Hastane hastane){

        hastaneler.add(hastane);
    }
    public List<Hastane> getHastaneler() {
        return hastaneler;
    }

    public void setHastaneler(List<Hastane> hastaneler) {
        this.hastaneler = hastaneler;
    }
}
