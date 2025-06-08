abstract class Kontenery {
    protected int masaLadunku;
    protected int wysokosc;
    protected int wagaWlasna;
    protected int glebokosc;
    protected int maxLadownosc;
    protected Produkty produkt;
    protected String nrSeryjny;
    protected static int licznik = 1;

    public Kontenery(Produkty produkt, int wysokosc, int wagaWlasna, int glebokosc, int maxLadownosc) {
        this.wysokosc = wysokosc;
        this.wagaWlasna = wagaWlasna;
        this.glebokosc = glebokosc;
        this.maxLadownosc = maxLadownosc;
        this.produkt = produkt;
        this.nrSeryjny = "KON-" + getTyp() + "-" + (licznik++);
    }

    protected abstract String getTyp();

    public String getNrSeryjny() { return nrSeryjny; }

    public abstract void zaladuj(int masa, Produkty produkt);

    public abstract void oproznij();

    public String getInfo() {
        return nrSeryjny + ": " + produkt.getNazwa() + ", " + masaLadunku + "kg";
    }
}