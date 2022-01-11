import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Klient extends Osoba{
    private BufferedImage skanPrawajazdy;
    private BufferedImage skanDowodu;
    private ArrayList<Rezerwacja> historiaWypozyczen;

    public Klient(String login, String haslo, String imie, String nazwisko, String numerTelefonu, String email,
                  BufferedImage skanPrawajazdy, BufferedImage skanDowodu) {

        super(login, haslo, imie, nazwisko, numerTelefonu, email);
        this.skanPrawajazdy = skanPrawajazdy;
        this.skanDowodu = skanDowodu;
    }

    public void aktualizujHistorieWypozyczen(Rezerwacja rezerwacja) {}
}
