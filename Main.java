public class Main {
    public static void main(String[] args) {

        // ------------------ WSZYSTKIE MOZLIWE PRODUKTY ----------------------------------
        Produkty Bananas = new Produkty("Bananas", 13.3, false);
        Produkty Chocolate = new Produkty("Chocolate", 18, false);
        Produkty Fish = new Produkty("Fish", 2, false);
        Produkty Meat = new Produkty("Meat", -15, false);
        Produkty IceCream = new Produkty("Ice cream", -18, false);
        Produkty Cheese = new Produkty("Cheese", 7.2, false);
        Produkty Sausages = new Produkty("Sausages", 5, false);
        Produkty Butter = new Produkty("Butter", 20.5, false);
        Produkty Eggs = new Produkty("Eggs", 19, false);
        // Plyny
        Produkty Milk = new Produkty("Milk", 8, false);
        Produkty Paliwo = new Produkty("Paliwo", 15, true);
        //Gaz
        Produkty Gas = new Produkty("Gas", 5, true);





        KonPlyn kon1 = new KonPlyn(10, 50, 100, 50, 100);
        System.out.println(kon1.getNrSeryjny());

        kon1.ZaladowanieKontenera(50, Paliwo);
    }
}