package polimorphism;

public class Om extends Vietate {
    public Om() {
        super();
    }

    @Override
    public void deplasare() {
        System.out.println("Pe pamant");
    }

    public Om(String metodaDeDeplasare) {
        super(metodaDeDeplasare);
    }

    public Om(String metodaDeDeplasare, String mediulDeTrai) {
        super(metodaDeDeplasare, mediulDeTrai);
    }

    @Override
    public void actiune() {
        super.actiune();
    }

    @Override
    public void actiune(String numeActiune) {
        super.actiune(numeActiune);
    }

    @Override
    public String actiune(String a, String b) {
        return super.actiune(a, b);
    }
}
