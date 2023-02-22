package inheritance;

public class MainClassInheritance {

    public static void main(String[] args) {
        Vehicul masina1 = new Vehicul();
        Masina masina2 = new Masina("OPEL");

        masina1.setCuloare("albastra");
        masina1.setNrRoti(4);
        masina1.afiseazaDetaliiVehicul();

        masina2.setNrRoti(4);
        masina2.setMarca(" DACIA");
        masina2.setCuloare(" rosu");
        masina2.afiseazaDetaliiVehicul();
    }

}
