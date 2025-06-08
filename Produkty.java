class Produkty {
    private String nazwa;
    private double temperatura;
    private boolean czyNiebezpieczny;

    public String getNazwa() { return nazwa; }
    public double getTemperatura() { return temperatura; }
    public boolean getCzyNiebezpieczny() { return czyNiebezpieczny; }

    public Produkty(String nazwa, double temperatura, boolean czyNiebezpieczny) {
        this.nazwa = nazwa;
        this.temperatura = temperatura;
        this.czyNiebezpieczny = czyNiebezpieczny;
    }
}