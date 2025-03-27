import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Wydarzenie> wydarzenia = new ArrayList<>();
    private ArrayList<Klient> klienci = new ArrayList<>();

    public void dodajWydarzenie(Wydarzenie w) {
        wydarzenia.add(w);
    }

    public void dodajKlienta(Klient k) {
        klienci.add(k);
    }

    public Wydarzenie znajdzWydarzenie(String nazwa) {
        for (Wydarzenie w : wydarzenia) {
            if (w.getNazwa().equals(nazwa)) {
                return w;
            }
        }
        return null;
    }

    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        klient.dodajRezerwacje(wydarzenie);
    }
}
