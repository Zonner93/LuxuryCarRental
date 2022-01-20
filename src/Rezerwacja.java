

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Set;

public class Rezerwacja {

    private int MINIMALNA_ILOSC_DNI_DO_RABATU = 7;
    private LocalDateTime dataZlozenia = LocalDateTime.now();
    private float RABAT_PROCENT = 0.15f;
    private Status status = Status.zlozona;
    private LocalDateTime ostatecznyTerminOplaceniaWCalosci;
    private float pozostalaKwotaDoOplacenia;
    private LocalDateTime dataRozpoczecia;
    private LocalDateTime dataZakonczenia;
    private float calokowitaWartoscRezerwacji;
    private PracownikOddzialu pracownikOddzialu;
    private Auto auto;
    private static Set<Rezerwacja> listaRezerwacji;


    public Rezerwacja(LocalDateTime dataRozpoczecia, LocalDateTime dataZakonczenia, PracownikOddzialu pracownikOddzialu, Auto auto) {
        this.dataRozpoczecia = dataRozpoczecia;
        this.dataZakonczenia = dataZakonczenia;
        this.pracownikOddzialu = pracownikOddzialu;
        this.auto = auto;
    }

    public static void zlozRezerwacje() {}
//    public boolean sprawdzDostepnoscAuta(Auto auto) {}

    public float obliczIleDniDoRezerwacji() {
        return ChronoUnit.DAYS.between(dataRozpoczecia, dataZlozenia);
    }

    public float ileDniTrwaRezerwacja() {
        return ChronoUnit.DAYS.between(dataZakonczenia, dataRozpoczecia);
    }

    public boolean przyznajRabat() {
        return ileDniTrwaRezerwacja() > MINIMALNA_ILOSC_DNI_DO_RABATU;
    }
    public float obliczCalkowityKosztRezerwacji() {
        calokowitaWartoscRezerwacji = ileDniTrwaRezerwacja() * auto.getCenaZaDobe();
        if(przyznajRabat()){
            calokowitaWartoscRezerwacji = calokowitaWartoscRezerwacji * (1.0f - RABAT_PROCENT);
        }
        return calokowitaWartoscRezerwacji;
    }
    public void oplacCalosc() {}
    public void anulujRezerwacje(Rezerwacja rezerwacja) {}
    public static void anulujRezerwacje(Set<Rezerwacja> rezerwacjeDoAnulowania){}
    public void przydzielDoRealizacji(PracownikOddzialu pracownikOddzialu) {}
    public void wyswietlInformacjeORezerwacji() {}
    public void zmianaStatusuRezerwacji() {}
//    public static ArrayList<Auto> utworzListeWypozyczonychAut() {}
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

    public int getMINIMALNA_ILOSC_DNI_DO_RABATU() {
        return MINIMALNA_ILOSC_DNI_DO_RABATU;
    }

    public LocalDateTime getDataZlozenia() {
        return dataZlozenia;
    }
}

