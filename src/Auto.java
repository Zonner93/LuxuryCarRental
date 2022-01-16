
import java.awt.image.BufferedImage;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Auto {
    private float cenaZaDobe;
    private ArrayList<LocalDateTime> terminyRezerwacji;
    private Marka marka;
    private String model;
    private HashMap<String, String> daneTeczhniczne;
    private ArrayList<BufferedImage> zdjecia;
    private boolean czyUszkodzone = false;
    private String numerRejestracyjny;
    private ArrayList<Rezerwacja> historiaRezerwacji = new ArrayList<>();
    private OddzialWypozyczalni oddzialWypozyczalni;

    public Auto(long cenaZaDobe, Marka marka, String model, OddzialWypozyczalni oddzialWypozyczalni) {
        this.cenaZaDobe = cenaZaDobe;
        this.marka = marka;
        this.model = model;
        this.oddzialWypozyczalni = oddzialWypozyczalni;
        oddzialWypozyczalni.dodajAuto(this);
    }

    public void aktualizujDane() {}
    public void dodajAuto() {}
    public void usunAuto() {}
    public void wyswietlOferte() {}
    public void wyswietlSzczegoloweInformacje() {}
    public void zablokujMozliwoscRezerwacji(boolean czyUszkodzone, Auto auto) {}
    public void odblokujMozliwoscRezerwacji(boolean czyUszkodzone, Auto auto) {}
    public void wyswietlFormularzDoKiedyAutoNiedostepne() {}
//    public Auto znajdAuto(String numerRejestracyjny) {}
//    public boolean czyAutoUszkodzone() {}
//    public void dodajRezerwacjeDoHistorii(Rezerwacja rezerwacja) {


    public void setCzyUszkodzone(boolean czyUszkodzone) {
        this.czyUszkodzone = czyUszkodzone;
    }

    public float getCenaZaDobe() {
        return cenaZaDobe;
    }
}
