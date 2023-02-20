package Encapsularea;

public class ContBancar {

    private String numarCont ;

    private String sold;

    public String getNumarCont() {
        return numarCont;
    }

    public void setNumarCont(String numarCont) {
        this.numarCont = numarCont;
    }

    public String getSold() {
        return sold;
    }

    public void setSold(String sold) {
        this.sold = sold;
    }

    public void afisareSoldInCont(String soldulContului) {
        System.out.println("Soldul In Contul Dumneavoastra este de ");
    }
}
