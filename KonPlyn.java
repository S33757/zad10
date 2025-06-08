class KonPlyn extends Kontenery implements IHazardNotifier {
    public KonPlyn(int wysokosc, int wagaWlasna, int glebokosc, int maxLadownosc) {
        super(null, wysokosc, wagaWlasna, glebokosc, maxLadownosc);
    }

    protected String getTyp() { return "L"; }

    public void zaladuj(int masa, Produkty produkt) {
        boolean niebezpieczny = produkt.getCzyNiebezpieczny();
        int limit = niebezpieczny ? (int)(maxLadownosc * 0.5) : (int)(maxLadownosc * 0.9);
        if (masa > limit) {
            notifyDanger("Overload", nrSeryjny);
            throw new OverfillException("Load exceeds limit");
        }
        this.produkt = produkt;
        this.masaLadunku = masa;
    }

    public void oproznij() {
        this.masaLadunku = 0;
    }

    public void notifyDanger(String message, String serialNumber) {
        System.out.println("Notifier: " + message + " | " + serialNumber);
    }
}