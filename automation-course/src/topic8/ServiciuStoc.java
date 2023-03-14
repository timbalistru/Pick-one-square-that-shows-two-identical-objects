public class ServiciuStoc {
    public static void main(String[] args) {
        Carte carte1 = new Carte("Mizerabilii", "Victor Hugo", 1234, 500);
        Carte carte2 = new Carte("Crima si pedeapsa", "Fiodor Dostoievski", 5678, 400);

        Stoc stoc = new Stoc(1, "Strada Libertatii nr. 1");
        System.out.println("Stocul este gol: " + stoc.esteStoculGol());

        stoc.adaugaCarteStoc(carte1);
        stoc.adaugaCarteStoc(carte2);

        System.out.println("Stocul este gol: " + stoc.esteStoculGol());
        System.out.println("Numarul de carti in stoc: " + stoc.nrDeCartiInStoc());

        System.out.println("Cartea 1 este in stoc: " + stoc.existaCarteInStoc(carte1));
        stoc.stergeCarteDinStoc(carte1);
        System.out.println("Cartea 1 este in stoc: " + stoc.existaCarteInStoc(carte1));
        System.out.println("Numarul de carti in stoc: " + stoc.nrDeCartiInStoc());
    }
}