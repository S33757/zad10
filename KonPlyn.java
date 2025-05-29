public class KonPlyn extends Kontenery {

    public KonPlyn(int masaLadunkuKG, int wysokoscCM, int wagaWlasnaKG, int glebokoscCM, int maxMasaLadunkuKG) {
        super(masaLadunkuKG, wysokoscCM, wagaWlasnaKG, glebokoscCM, maxMasaLadunkuKG);
        nrS2 = "L";
        nrSeryjny = wygenerujNrSeryjny();
    }

    @Override
    public void ZaladowanieKontenera(int iloscKG){

    }
}