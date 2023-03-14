public class Main6 {
    public static void main(String[] args) {
        ContulPersoanei persoana1 = new ContulPersoanei();
        ContulPersoanei persoana2 = new ContulPersoanei();
        persoana1.setNumePersoana("George");
        persoana1.setId(123);
        persoana1.setSumaCurenta(1000);
        persoana2.setNumePersoana("Vasile");
        persoana2.setId(456);
        persoana2.setSumaCurenta(500);
        persoana1.transferCatreOPersoana(50, persoana2);
        System.out.println("Suma lui " + persoana1.getNumePersoana() + " este: " + persoana1.getSumaCurenta());
        System.out.println("Suma lui " + persoana2.getNumePersoana() + " este: " + persoana2.getSumaCurenta());
    }
}