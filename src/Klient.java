import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Klient extends Osoba{
    private BufferedImage skanPrawajazdy;
    private BufferedImage skanDowodu;
    private ArrayList<Rezerwacja> historiaWypozyczen;
    private Rezerwacja rezerwacja;

    public Klient(String login, String haslo, String imie, String nazwisko, String numerTelefonu, String email) {
        super(login, haslo, imie, nazwisko, numerTelefonu, email);
    }
}
