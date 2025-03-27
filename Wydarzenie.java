public class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostepneMiejsca = 100;
    private double cena;

    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Wydarzenie(String nazwa, String data, String miejsce) {
        this.nazwa = nazwa;
        this.data = data;
        this.miejsce = miejsce;
    }

    public Wydarzenie(String nazwa, String data, String miejsce, double cena) {
        this.nazwa = nazwa;
        this.data = data;
        this.miejsce = miejsce;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getDostepneMiejsca() {
        return dostepneMiejsca;
    }

    public void zmniejszMiejsca() {
        if (dostepneMiejsca > 0) {
            dostepneMiejsca--;
        }
    }

    public void zmienCene(double nowaCena) {
        this.cena = nowaCena;
    }

    public String toString() {
        return "Wydarzenie: " + nazwa + ", Data: " + data + ", Miejsce: " + miejsce + ", Cena: " + cena;
    }
}
