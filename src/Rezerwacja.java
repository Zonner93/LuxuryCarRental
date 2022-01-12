import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class Rezerwacja {

    private final Integer id;
    private int MINIMALNA_ILOSC_DNI_DO_RABATU = 7;
    private LocalDateTime dataZlozenia;
    private Status status;
    private LocalDateTime ostatecznyTerminOplaceniaWCalosci;
    private float pozostalaKwotaDoOplacenia;
    private LocalDateTime dataRozpoczecia;
    private LocalDateTime dataZakonczenia;
    private float calokowitaWartoscRezerwacji;
    private PracownikOddzialu pracownikOddzialu;
    private Auto auto;


    public Rezerwacja(Integer id, LocalDateTime dataZlozenia, Status status, LocalDateTime ostatecznyTerminOplaceniaWCalosci,
                      float pozostalaKwotaDoOplacenia, LocalDateTime dataRozpoczecia, LocalDateTime dataZakonczenia,
                      float calokowitaWartoscRezerwacji, Auto auto) {
        this.id = id;

        this.dataZlozenia = dataZlozenia;
        this.status = status;
        this.ostatecznyTerminOplaceniaWCalosci = ostatecznyTerminOplaceniaWCalosci;
        this.pozostalaKwotaDoOplacenia = pozostalaKwotaDoOplacenia;
        this.dataRozpoczecia = dataRozpoczecia;
        this.dataZakonczenia = dataZakonczenia;
        this.calokowitaWartoscRezerwacji = calokowitaWartoscRezerwacji;
        this.auto = auto;
    }

    public void zlozRezerwacje() {}
//    public boolean sprawdzDostepnoscAuta(Auto auto) {}
    public void przyznajRabat() {}
//    public float obliczKosztRezerwacji() {}
    public void oplacCalosc() {}
    public void anulujRezerwacje() {}
    public void przydzielDoRealizacji(PracownikOddzialu pracownikOddzialu) {}
    public void wyswietlInformacjeORezerwacji() {}
    public void zmianaStatusuRezerwacji() {}
//    public ArrayList<Auto> utworzListeWypozyczonychAut() {}
//    public ArrayList<Auto> utworzListeWyporzyczonychAut() {}
    public void anulujNieoplaconeRezerwacje() {}
    public void wyswietlFormularzRezerwacji() {}
//    public boolean czyWymaganeOplacenieWCalosci() {}
    public void oplacZaliczke() {}
//    public Rezerwacja znajdzRezerwacje() {}
//    public ArrayList<LocalDateTime> wyswietlDostepneTerminyDlaAuta() {}
//    public ArrayList<Auto> wyswietlDostepneAutaWDanymTerminie() {}
    public void wyswietlPodsumowanie() {}
    public void informujODokonaniuRezerwwacji() {}
    public void zwrotAuta(Auto auto) {}
//    public void anulujRezerwacje() {}
    public void informujOPomyslnieZakonczonejRezerwacji() {}
}

