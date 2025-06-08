import java.util.ArrayList;
import java.util.List;

public class Statki {
    private String nazwa;
    private int maxIloscKontenerow;
    private double maxLadownoscTon;
    private double maxPredkosc;
    private List<Kontenery> kontenery;

    public Statki(String nazwa, int maxIloscKontenerow, double maxLadownoscTon, double maxPredkosc) {
        this.nazwa = nazwa;
        this.maxIloscKontenerow = maxIloscKontenerow;
        this.maxLadownoscTon = maxLadownoscTon;
        this.maxPredkosc = maxPredkosc;
        this.kontenery = new ArrayList<>();
    }

    public boolean zaladujKontener(Kontenery kontener) {
        if (kontenery.size() >= maxIloscKontenerow) {
            System.out.println("Statek pelny: " + nazwa);
            return false;
        }
        double sumaLadunku = getLacznaWagaKontenerow() + kontener.masaLadunku + kontener.wagaWlasna;
        if (sumaLadunku > maxLadownoscTon * 1000) {
            System.out.println("Przekroczono limit ladownosci statku: " + nazwa);
            return false;
        }
        kontenery.add(kontener);
        System.out.println("Zaladowano kontener: " + kontener.getNrSeryjny());
        return true;
    }

    public boolean usunKontener(String nrSeryjny) {
        return kontenery.removeIf(k -> k.getNrSeryjny().equals(nrSeryjny));
    }

    public void wyswietlInfo() {
        System.out.println("Statek: " + nazwa);
        System.out.println("Predkosc maksymalna: " + maxPredkosc + " wezlow");
        System.out.println("Kontenery na pokladzie: " + kontenery.size());
        for (Kontenery k : kontenery) {
            System.out.println(" - " + k.getInfo());
        }
    }

    private double getLacznaWagaKontenerow() {
        return kontenery.stream()
                .mapToDouble(k -> k.masaLadunku + k.wagaWlasna)
                .sum();
    }
}
