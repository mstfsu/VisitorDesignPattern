public abstract class Element {
    private String adi;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public abstract int accept(Visitor v);

    public Element(String adi){
        this.adi=adi;
    }
}
