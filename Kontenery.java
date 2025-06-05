public class Kontenery {

    private int MasaLadunkuKG;
    private int WysokoscCM;
    private int WagaWlasnaKG;
    private int GlebokoscCM;
    private int MaxMasaLadunkuKG;
    Produkty produkty;

    protected static int n = 0;
    protected String nrS1 = "KON";
    protected String nrS2 = "Brak";
    protected String nrSeryjny;

    protected String wygenerujNrSeryjny() {
        n++;
        return nrS1 + "-" + nrS2 + "-" + n;
    }

    public Kontenery(Produkty produkty, int masaLadunkuKG, int wysokoscCM, int wagaWlasnaKG, int glebokoscCM, int maxMasaLadunkuKG) {
        MasaLadunkuKG = masaLadunkuKG;
        WysokoscCM = wysokoscCM;
        WagaWlasnaKG = wagaWlasnaKG;
        GlebokoscCM = glebokoscCM;
        MaxMasaLadunkuKG = maxMasaLadunkuKG;
        nrSeryjny = wygenerujNrSeryjny();
    }

    public String getNrSeryjny() {
        return nrSeryjny;
    }


    public void OproznienieLadunku() {
        MasaLadunkuKG = 0;
        System.out.println("Kontener: " + nrSeryjny + " zostal oprozniony.");
    }

    public void ZaladowanieKontenera(int IloscKG, Produkty produkty) {
        if(produkty.getCzyNiebezpieczny() == true){
            MaxMasaLadunkuKG = MaxMasaLadunkuKG / 2;
        }
        if(MaxMasaLadunkuKG < IloscKG){
            throw new RuntimeException("Masa ladunku jest wieksza niz pojemnosc kontenera.");
        }else{
            MasaLadunkuKG = IloscKG;
            System.out.println("Kontener: " + nrSeryjny + " zostal zaladowany.");
        }
    }


    // ------ Gettery wszystkie private ----

    public int getMasaLadunkuKG() {
        return MasaLadunkuKG;
    }

    public int getWysokoscCM() {
        return WysokoscCM;
    }

    public int getWagaWlasnaKG() {
        return WagaWlasnaKG;
    }

    public int getGlebokoscCM() {
        return GlebokoscCM;
    }

    public int getMaxMasaLadunkuKG() {
        return MaxMasaLadunkuKG;
    }
}
