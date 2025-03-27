public class Main {
    public static void main(String[] args) {
        SystemRezerwacji system = new SystemRezerwacji();

        Wydarzenie koncert = new Wydarzenie("Koncert Symphony", 120.0);
        system.dodajWydarzenie(koncert);

        Klient klient1 = new Klient("Jan", "Nowak", "jan@example.com");
        Klient klient2 = new Klient("Anna", "Kowalska", "anna@example.com");

        system.dodajKlienta(klient1);
        system.dodajKlienta(klient2);

        system.dokonajRezerwacji(klient1, koncert);
        klient1.wyswietlRezerwacje();

        System.out.println("Dostępne miejsca na koncert: " + koncert.getDostepneMiejsca());
    }
}
