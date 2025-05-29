public class Main {
    public static void main(String[] args) {
        KonPlyn kon1 = new KonPlyn(10, 50, 100, 50, 100);
        System.out.println(kon1.getNrSeryjny());

        KonPlyn kon2 = new KonPlyn(20, 60, 110, 60, 200);
        System.out.println(kon2.getNrSeryjny());

        KonPlyn kon3 = new KonPlyn(30, 70, 110, 70, 200);
        System.out.println(kon3.getNrSeryjny());

        kon2.ZaladowanieKontenera(200);
        System.out.println(kon2.getMasaLadunkuKG());
        kon2.OproznienieLadunku();
        System.out.println(kon2.getMasaLadunkuKG());
    }
}