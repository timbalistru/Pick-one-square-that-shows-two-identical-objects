import abstraction.Mamal;
import abstraction.Planta;
import abstraction.Vietate;

public class Application {

    public static void main(String[] args) {
        Vietate vietate = new Mamal();
        Vietate vietate1 = new Planta();

        vietate.seHraneste();
        vietate.sunet();
        vietate1.seHraneste();
        vietate.sunet();
    }
}
