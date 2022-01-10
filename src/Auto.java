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
    private boolean czyUszkodzone;
    private String numerRejestracyjny;

    public Auto(Marka marka, String model, HashMap<String, String> daneTeczniczne) {
        this.marka = marka;
        this.model = model;
        this.daneTeczhniczne = daneTeczniczne;
    }


    public void dodajAuto() {}
    public void usunAuto() {}
    public void wyswietlOferte() {}
    public void wyswietlSzczegoloweInformacje() {}
    public void zablokujMozliwoscRezerwacji(boolean czyUszkodzone, Auto auto) {}
    public void odblokujMozliwoscRezerwacji(boolean czyUszkodzone, Auto auto) {}
    public void wyswietlFormularzDoKiedyAutoNiedostepne() {}
    public Auto znajdAuto(String numerRejestracyjny) {}
    public boolean czyAutoUszkodzone() {}

}
