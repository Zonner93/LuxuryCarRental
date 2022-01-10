import java.awt.image.BufferedImage;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Auto {
    private float cenaZaDobe;
    private ArrayList<LocalDateTime> terminyRezerwacji;
    private Marka marka;
    private String model;
    private HashMap<String, String> daneTeczhniczne;
    private ArrayList<BufferedImage> zdjecia;
    private boolean czyUszkodzone;
    private String numerRejestracyjny;

    public Auto(Marka marka, String model, HashMap<String, String> daneTeczhniczne) {
        this.marka = marka;
        this.model = model;
        this.daneTeczhniczne = daneTeczhniczne;
    }

    public void setCenaZaDobe(float cenaZaDobe) {
        this.cenaZaDobe = cenaZaDobe;
    }

    public void setTerminyRezerwacji(ArrayList<LocalDateTime> terminyRezerwacji) {
        this.terminyRezerwacji = terminyRezerwacji;
    }

    public void setZdjecia(ArrayList<BufferedImage> zdjecia) {
        this.zdjecia = zdjecia;
    }

    public void setCzyUszkodzone(boolean czyUszkodzone) {
        this.czyUszkodzone = czyUszkodzone;
    }

    public void setNumerRejestracyjny(String numerRejestracyjny) {
        this.numerRejestracyjny = numerRejestracyjny;
    }

    public void dodajAuto() {}
    public void usunAuto() {}
}
