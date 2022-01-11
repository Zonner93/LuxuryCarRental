import lombok.Getter;
import lombok.Setter;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

@Getter @Setter
public class Klient extends Osoba{
    private BufferedImage skanPrawajazdy;
    private BufferedImage skanDowodu;
    private ArrayList<Rezerwacja> historiaWypozyczen;
    private ArrayList<Rezerwacja> listaAktualnychRezerwacji;

    public Klient(Integer id, String login, String haslo, String imie, String nazwisko, String numerTelefonu, String email,
                  BufferedImage skanPrawajazdy, BufferedImage skanDowodu) {

        super(id, login, haslo, imie, nazwisko, numerTelefonu, email);
        this.skanPrawajazdy = skanPrawajazdy;
        this.skanDowodu = skanDowodu;
    }

    public void aktualizujHistorieWypozyczen(Rezerwacja rezerwacja) {
        historiaWypozyczen.add(rezerwacja);
        listaAktualnychRezerwacji.remove(rezerwacja);
    }

}
