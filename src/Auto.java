import lombok.Getter;
import lombok.Setter;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

@Getter @Setter
public abstract class Auto {
    private final Integer id;
    private float cenaZaDobe = 0.0f;
    private ArrayList<LocalDateTime> terminyRezerwacji;
    private Marka marka;
    private String model;
    private HashMap<String, String> daneTeczhniczne;
    private ArrayList<BufferedImage> zdjecia;
    private boolean czyUszkodzone = false;
    private String numerRejestracyjny;
    private HashMap<Integer, Rezerwacja> historiaRezerwacji;

    public Auto(Integer id, Marka marka, String model, HashMap<String, String> daneTeczniczne) {
        this.id = id;
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
//    public Auto znajdAuto(String numerRejestracyjny) {}
//    public boolean czyAutoUszkodzone() {}
    public void dodajRezerwacjeDoHistorii(Rezerwacja rezerwacja) {
        historiaRezerwacji.put(rezerwacja.getId(), rezerwacja);
    }

}
