class KonGaz extends Kontenery implements IHazardNotifier {
    private double cisnienie;

    public KonGaz(int wysokosc, int wagaWlasna, int glebokosc, int maxLadownosc, double cisnienie) {
        super(null, wysokosc, wagaWlasna, glebokosc, maxLadownosc);
        this.cisnienie = cisnienie;
    }

    protected String getTyp() { return "G"; }

    public void zaladuj(int masa, Produkty produkt) {
        if (masa > maxLadownosc) {
            notifyDanger("Overload", nrSeryjny);
            throw new OverfillException("Load exceeds gas container capacity");
        }
        this.produkt = produkt;
        this.masaLadunku = masa;
    }

    public void oproznij() {
        masaLadunku *= 0.05;
    }

    public void notifyDanger(String message, String serialNumber) {
        System.out.println("Notifier: " + message + " | " + serialNumber);
    }
}
