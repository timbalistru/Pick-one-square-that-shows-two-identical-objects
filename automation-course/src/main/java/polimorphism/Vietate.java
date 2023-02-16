package polimorphism;

public class Vietate {

    String metodaDeDeplasare;

    String mediulDeTrai;

    public Vietate() {
        System.out.println("fara parametri");

    }

    public void deplasare() {
        System.out.println("Vietatea se deplaseaza intr-o oarecare forma");
    }

    public Vietate(String metodaDeDeplasare) {
        this.metodaDeDeplasare = metodaDeDeplasare;
        System.out.println("Cunoastem metoda de deplasare: " + metodaDeDeplasare);

    }

    public Vietate(String metodaDeDeplasare, String mediulDeTrai) {

        System.out.println("Cunoastem metoda de deplasare " + metodaDeDeplasare + "si mediul de trai " + mediulDeTrai);
    }


    //Exemple de overloading

    public void actiune() {
        System.out.println("Face o actiune ");
    }

    public void actiune(String numeActiune) {
        System.out.println("Fac " + numeActiune);
    }

    public String actiune(String a, String b) {
        return "";
    }

}
