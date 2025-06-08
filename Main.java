public class Main {
    public static void main(String[] args) {
        Produkty milk = new Produkty("Milk", 8.0, false);
        Produkty fuel = new Produkty("Fuel", 15.0, true);
        Produkty helium = new Produkty("Helium", 5.0, true);
        Produkty bananas = new Produkty("Bananas", 13.0, false);
        Produkty ice = new Produkty("Ice cream", -18.0, false);

        KonPlyn kontenerPlyn = new KonPlyn(260, 1000, 600, 2000);
        KonGaz kontenerGaz = new KonGaz(240, 900, 500, 1500, 5.0);
        KonChlod kontenerChlod = new KonChlod(250, 950, 550, 1800, -10.0);

        try {
            kontenerPlyn.zaladuj(800, milk);
            System.out.println(kontenerPlyn.getInfo());
        } catch (Exception e) {
            System.out.println("Blad: " + e.getMessage());
        }

        try {
            kontenerPlyn.zaladuj(1200, fuel);
        } catch (Exception e) {
            System.out.println("Blad: " + e.getMessage());
        }

        try {
            kontenerGaz.zaladuj(1400, helium);
            System.out.println(kontenerGaz.getInfo());
            kontenerGaz.oproznij();
        } catch (Exception e) {
            System.out.println("Blad: " + e.getMessage());
        }

        try {
            kontenerChlod.zaladuj(1000, ice);
            System.out.println(kontenerChlod.getInfo());
        } catch (Exception e) {
            System.out.println("Blad: " + e.getMessage());
        }
    }
}
