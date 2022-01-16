import java.time.LocalDate;
import java.time.LocalTime;

public class Realizacja {
    private LocalDate data = LocalDate.now();
    private LocalTime godzina = LocalTime.now();
    private Czynnosc czynnosc = Czynnosc.wydanieAuta;
    private Rezerwacja rezerwacja;
    private PracownikOddzialu pracownikOddzialu;

    public Realizacja(Rezerwacja rezerwacja, PracownikOddzialu pracownikOddzialu) {
        this.rezerwacja = rezerwacja;
        this.pracownikOddzialu = pracownikOddzialu;
        pracownikOddzialu.przydzielRealizacje(this);
    }
}
