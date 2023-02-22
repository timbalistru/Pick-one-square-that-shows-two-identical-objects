package encapsulation;

public class MainClass1 {

    public static void main(String[] args) {

        ContBancar cont= new ContBancar(22469872391l,50000.8768f);

        System.out.println(cont.getNumarCont());
        cont.setSold(630258.971f);
        System.out.println(cont.getSold());
    }
}
