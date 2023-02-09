
public class Application {


    public static void main(String[] args) {
        Telefon telefonDima = new Telefon("Siemens");
        Telefon telefonVlad = new Telefon("Samsung");

      /*  System.out.println("Telefonul lui Dima este de marca " + telefonDima.getMarcaTelefon());
        System.out.println("Telefonul lui Vlad este de marca " + telefonVlad.getMarcaTelefon());*/
        telefonDima.setMemorieRam(-100);
    }
}
