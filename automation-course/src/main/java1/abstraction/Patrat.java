package abstraction;

public class Patrat extends FormaGeometrica {

    private double latura;

    public double getLatura() {
        return latura;
    }

    public void setLatura(double latura) {
        this.latura = latura;

    }

    public Patrat (double latura) {
        setLatura(latura);
    }

    @Override
    double calculArie () {
        return latura*latura;
    }
}
