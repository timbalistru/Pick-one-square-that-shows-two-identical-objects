import Encapsularea.ContBancar;
import abstraction.Mamal;
import abstraction.Planta;
import abstraction.Vietate;

public class Application {

    public static void main(String[] args) {
        Vietate vietate = new Mamal();
        Vietate vietate1 = new Planta();
;
        ContBancar contBancar = new ContBancar();

        contBancar.setNumarCont("123456");

        String numarCont = contBancar.getNumarCont();

        System.out.println(numarCont);

/*        vietate.seHraneste();
        vietate.sunet();
        vietate1.seHraneste();
        vietate.sunet();*/
    }
}


