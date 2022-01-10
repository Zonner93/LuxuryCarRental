import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Klient extends Osoba{
    private BufferedImage skanPrawajazdy;
    private BufferedImage skanDowodu;
    private ArrayList<Rezerwacja> historiaWypozyczen;
    private Rezerwacja rezerwacja;

    public Klient(BufferedImage skanPrawajazdy, BufferedImage skanDowodu) {
        this.skanPrawajazdy = skanPrawajazdy;
        this.skanDowodu = skanDowodu;
    }
}
