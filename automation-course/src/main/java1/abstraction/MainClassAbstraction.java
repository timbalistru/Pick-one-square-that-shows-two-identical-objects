package abstraction;

public class MainClassAbstraction {
    public static void main(String[] args) {

        FormaGeometrica triunghi = new Triunghi(4.2, 6.3);
        triunghi.calculArie();
        System.out.println("Aria triunghilui este " + triunghi.calculArie());


        FormaGeometrica patrat = new Patrat(10.68);
        System.out.println("Aria patratului este " + patrat.calculArie());

    }
}
