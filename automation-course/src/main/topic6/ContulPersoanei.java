public class ContulPersoanei {

    //definirea proprietatilor
    private String numePersoana;
    private int id;
    private double sumaCurenta;

    //metodele getter
    public String getNumePersoana() {
        return numePersoana;
    }

    public int getId() {
        return id;
    }

    public double getSumaCurenta() {
        return sumaCurenta;
    }

    //metodele setter
    public void setNumePersoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSumaCurenta(double sumaCurenta) {
        this.sumaCurenta = sumaCurenta;
    }

    //metode de gestiune
    public void sustragereDeBani(double suma) {
        if (
                suma > 0 &&
                        suma <= this.sumaCurenta
        ) {
            this.sumaCurenta -= suma;
        } else {
            throw new IllegalArgumentException("Suma nu poate fi mai mare decat suma curenta!");
        }
    }

    public void transferCatreOPersoana(double suma, ContulPersoanei persoana) {
        try {
            if (suma > 0 && suma <= this.sumaCurenta) {
                this.sumaCurenta -= suma;
                persoana.sumaCurenta += suma;
            } else {
                throw new IllegalArgumentException("Suma nu poate fi mai mare decat suma curenta!");
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Operatiunea a fost finalizata!");
        }
    }
}
