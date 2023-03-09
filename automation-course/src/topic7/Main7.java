
public class Main7 {
    public static void main(String[] args) {
        String caleaCatreFisier = "C:/Users/User/Desktop/fisier.txt";
        String date = "Acesta este un text pentru testare.";
        FileManager.scriereaInformatiTextinFisier(caleaCatreFisier, date);
        FileManager.alipireaInformatieiLaFisier(caleaCatreFisier, " Acesta este un al doilea text pentru testare.");
        String dateDinFisier = FileManager.citireaDateDinFisier(caleaCatreFisier);
        System.out.println(dateDinFisier);
    }
}