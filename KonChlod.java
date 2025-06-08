class KonChlod extends Kontenery {
    private double temperaturaKontenera;

    public KonChlod(int wysokosc, int wagaWlasna, int glebokosc, int maxLadownosc, double temperaturaKontenera) {
        super(null, wysokosc, wagaWlasna, glebokosc, maxLadownosc);
        this.temperaturaKontenera = temperaturaKontenera;
    }

    protected String getTyp() { return "C"; }

    public void zaladuj(int masa, Produkty produkt) {
        if (this.produkt != null && !this.produkt.getNazwa().equals(produkt.getNazwa())) {
            throw new RuntimeException("Different product type not allowed");
        }
        if (produkt.getTemperatura() < temperaturaKontenera) {
            throw new RuntimeException("Container temperature too low");
        }
        if (masa > maxLadownosc) {
            throw new OverfillException("Overload");
        }
        this.produkt = produkt;
        this.masaLadunku = masa;
    }

    public void oproznij() {
        masaLadunku = 0;
    }
}