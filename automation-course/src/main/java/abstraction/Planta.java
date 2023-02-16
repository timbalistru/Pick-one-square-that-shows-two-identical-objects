package abstraction;

public class Planta extends Vietate {


    @Override
    public void seHraneste() {
        System.out.println("cu oxigen");
    }

    @Override
    public void deplasare() {
        System.out.println("nu se deplaseaza");
    }
}
