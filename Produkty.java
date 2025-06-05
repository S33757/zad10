public class Produkty {
    private String nazwa;
    private double temperatura;
    private Boolean czyNiebezpieczny;

    public String getNazwa() {
        return nazwa;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public Boolean getCzyNiebezpieczny() {
        return czyNiebezpieczny;
    }

    public Produkty(String nazwa, double temperatura, Boolean czyNiebezpieczny) {
        this.nazwa = nazwa;
        this.temperatura = temperatura;
        this.czyNiebezpieczny = czyNiebezpieczny;


    }
}
