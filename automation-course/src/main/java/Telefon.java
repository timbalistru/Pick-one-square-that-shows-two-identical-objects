public class Telefon {

    private String marcaTelefon = "Xiomi";

    private String modeltelefon = "X12";

    private Integer memorieRam = -100;

    private Float displaySize = 15.3F;

    private Integer baterie = 5000;

    Telefon() {
        marcaTelefon = "Xiaomi";
    }

    Telefon(String denumireMarcaTelefon) {
        this.marcaTelefon = marcaTelefon;
    }

    public void facPoza() {
        System.out.println("Pozat ");

    }

    public void sunaPe(String contact) {
        System.out.println("Calling " + contact);
    }

    public void primesteMesaj(String expediator, String text) {
        System.out.println("Un nou mesaj primit de la " + expediator);
        System.out.println(text);
    }

    public String getMarcaTelefon() {
        return marcaTelefon;
    }

    public void setMarcaTelefon(String marcaTelefon) {
        this.marcaTelefon = marcaTelefon;
    }

    public String getModeltelefon() {
        return modeltelefon;
    }

    public void setModeltelefon(String modeltelefon) {
        this.modeltelefon = modeltelefon;
    }

    public Integer getMemorieRam() {
        return memorieRam;
    }

    public void setMemorieRam(Integer memorieRam) {
        if (memorieRam < 0 )
            throw  new IllegalArgumentException("Memoria RAm trebuie sa fie doar pozitiva ");
        this.memorieRam = memorieRam;
    }

    public void printDisplaySize() {
        System.out.println(this.displaySize);
    }

    public void setDisplaySize(Float displaySize) {
        this.displaySize = displaySize;
    }

    public Integer getBaterie() {
        return baterie;
    }

    public void setBaterie(Integer baterie) {
        this.baterie = baterie;
    }
}
