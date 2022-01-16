import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;

public class Klient {
    private BufferedImage skanPrawajazdy;
    private BufferedImage skanDowodu;
    private ArrayList<Rezerwacja> historiaWypozyczen;
    private ArrayList<Rezerwacja> listaAktualnychRezerwacji;

    public void setSkanPrawajazdy(BufferedImage skanPrawajazdy) {
        this.skanPrawajazdy = skanPrawajazdy;
    }

    public void setSkanDowodu(BufferedImage skanDowodu) {
        this.skanDowodu = skanDowodu;
    }

}
