package polimorphism;

public class MainClassPolimorphism {
    public static void main(String[] args) {

        Animal pisica = new Pisica();
        pisica.emiteSunet();

        Animal caine = new Caine();
        caine.emiteSunet();
    }
}
