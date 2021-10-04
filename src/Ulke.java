import java.util.ArrayList;
import java.util.List;

public class Ulke extends Element{
    private List<İl> iller;

    public int accept(Visitor visitor){
        return visitor.visitUlke(this);
    }

    public Ulke(String adi) {
        super(adi);
        this.iller=new ArrayList<>();
    }

    public void ilEkle(İl il){

        iller.add(il);
    }
    public List<İl> getIller() {
        return iller;
    }

    public void setIller(List<İl> iller) {
        this.iller = iller;
    }
}
