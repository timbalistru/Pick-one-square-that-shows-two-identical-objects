public class Persoana {

    public String nume;

    private Integer varsta;

    protected Character sex;

    public Persoana(String nume, int varsta, char sex) {
        this.nume = nume;
        this.varsta = varsta;
        this.sex = sex;

    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

}
