package abstraction;

public class Mamal extends Vietate implements Nastere  {

    @Override
    public void  seHraneste() {
        System.out.println("cu lapte");
    }

    @Override
    public void deplasare() {

        System.out.println("pe pamant");
    }

    @Override
    public void seNaste() {
        System.out.println("se naste");
    }
}
