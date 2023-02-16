package polimorphism;

public class Peste extends Vietate {
    public Peste() {
        super();
    }

    @Override
    public void actiune() {
        super.actiune();
    }

    @Override
    public void deplasare() {
        System.out.println("prin intermediul la inot");
    }
}
