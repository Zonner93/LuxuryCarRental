import java.time.LocalDateTime;
import java.util.ArrayList;

public class Rezerwacja {
    public int MINIMALNA_ILOSC_DNI_DO_RABATU = 7;
    private LocalDateTime dataZlozenia;
    private Status status;
    private LocalDateTime ostatecznyTerminOplaceniaWCalosci;
    private float pozostalaKwotaDoOplacenia;
    private LocalDateTime dataRozpoczecia;
    private LocalDateTime dataZakonczenia;
    private float calokowitaWartoscRezerwacji;
    private PracownikOddzialu pracownikOddzialu;

    public void zlozRezerwacje() {}
    public boolean sprawdzDostepnoscAuta() {}
    public void przyznajRabat() {}
    public float obliczKosztRezerwacji() {}
    public void oplacCalosc() {}
    public void anulujRezerwacje() {}
    public void przydzielDoRealizacji(PracownikOddzialu) {}
    public void wyswietlInformacjeORezerwacji() {}
    public void zmianaStatusuRezerwacji() {}
    public ArrayList<Auto> utworzListeWypozyczonychAut() {}
    public ArrayList<Auto> utworzListeWyporzyczonychAut() {}
    public void anulujNieoplaconeRezerwacje() {}
    public void wyswietlFormularzRezerwacji() {}
    public boolean czyWymaganeOplacenieWCalosci() {}
    public void oplacZaliczke() {}
    public Rezerwacja znajdzRezerwacje() {}
    public ArrayList<LocalDateTime> wyswietlDostepneTerminyDlaAuta() {}
    public ArrayList<Auto> wyswietlDostepneAutaWDanymTerminie() {}
    public void wyswietlPodsumowanie() {}
    public void informujODokonaniuRezerwwacji() {}
    public void zwrotAuta(Auto auto) {}
//    public void anulujRezerwacje() {}
    public void informujOPomyslnieZakonczonejRezerwacji() {}
}

