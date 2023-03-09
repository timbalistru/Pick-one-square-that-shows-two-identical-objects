import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    //metoda de scriere a informatiei intr-un fisier
    public static void scriereaInformatiTextinFisier(String caleaCatreFisier, String date) {
        try {
            FileWriter writer = new FileWriter(caleaCatreFisier);
            writer.write(date);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //metoda de adaugare a informatiei intr-un fisier
    public static void alipireaInformatieiLaFisier(String caleaCatreFisier, String date) {
        try {
            FileWriter writer = new FileWriter(caleaCatreFisier, true);
            writer.append(date);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //metoda de citire a informatiei dintr-un fisier
    public static String citireaDateDinFisier(String caleaCatreFisier) {
        String date = "";
        try {
            FileReader reader = new FileReader(caleaCatreFisier);
            int c;
            while ((c = reader.read()) != -1) {
                date = date + (char) c;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return date;
    }
}