import lombok.Getter;
import lombok.Setter;

import java.awt.image.BufferedImage;
import java.util.HashMap;

@Getter @Setter
public class Klient extends Osoba{
    private BufferedImage skanPrawajazdy;
    private BufferedImage skanDowodu;
    private HashMap<Integer, Rezerwacja> historiaWypozyczen;
    private HashMap<Integer, Rezerwacja> listaAktualnychRezerwacji;

    public Klient(Integer id, String login, String hashHasla, String imie,
                  String nazwisko, String numerTelefonu, String email) {

        super(id, login, hashHasla, imie, nazwisko, numerTelefonu, email);
    }

    public void dodajSkanDowodu(BufferedImage skanDowodu) {}

    public void dodajSkanPrawajazdy(BufferedImage skanPrawajazdy) {}

    public void aktualizujHistorieWypozyczen(Rezerwacja rezerwacja) {
        historiaWypozyczen.put(rezerwacja.getId(), rezerwacja);
        listaAktualnychRezerwacji.remove(rezerwacja.getId());
    }
}
