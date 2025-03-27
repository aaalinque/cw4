import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> listaRezerwacji = new ArrayList<>();

    public Klient(String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    public String getImie() {
        return imie;
    }

    public void dodajRezerwacje(Wydarzenie wydarzenie) {
        if (wydarzenie.getDostepneMiejsca() > 0) {
            listaRezerwacji.add(wydarzenie);
            wydarzenie.zmniejszMiejsca();
        } else {
            System.out.println("Brak miejsc na wydarzenie: " + wydarzenie.getNazwa());
        }
    }

    public void wyswietlRezerwacje() {
        System.out.println("Rezerwacje klienta " + imie + ":");
        for (Wydarzenie w : listaRezerwacji) {
            System.out.println(" - " + w.getNazwa());
        }
    }
}
