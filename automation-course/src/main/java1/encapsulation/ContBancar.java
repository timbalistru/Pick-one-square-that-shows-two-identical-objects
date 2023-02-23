package encapsulation;

public class ContBancar {

    private long numarCont;
    private float sold;

    public ContBancar(long numarCont, float sold) {
        this.numarCont = numarCont;
        this.sold = sold;
    }

    public long getNumarCont() {
        return numarCont;
    }

    public void setNumarCont(long numarCont) {
        this.numarCont = numarCont;
    }

    public float getSold() {
        return sold;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }
}
