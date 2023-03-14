public class Carte {
    private String titlu;
    private String autor;
    private int numarDeSerie;
    private int pagini;


    public Carte(String titlu, String autor, int numarDeSerie, int pagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.numarDeSerie = numarDeSerie;
        this.pagini = pagini;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumarDeSerie() {
        return numarDeSerie;
    }

    public int getPagini() {
        return pagini;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", numarDeSerie=" + numarDeSerie +
                ", pagini=" + pagini +
                '}';
    }

}