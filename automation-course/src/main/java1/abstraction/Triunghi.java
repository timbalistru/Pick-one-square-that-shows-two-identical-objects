package abstraction;

public class Triunghi extends FormaGeometrica {

    private double baza;
    private double inaltime;

    public double getBaza() {
        return baza;
    }

    public void setBaza(double baza) {
        this.baza = baza;
    }

    public double getInaltime() {
        return inaltime;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public Triunghi(double baza, double inaltime) {
        setBaza(baza);
        setInaltime(inaltime);
    }

    @Override
    double calculArie() {
        return (baza * inaltime) / 2;
    }
}
