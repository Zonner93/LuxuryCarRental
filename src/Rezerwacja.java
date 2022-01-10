import java.time.LocalDateTime;

public class Rezerwacja {
    private LocalDateTime dataZlozenia;
    private Status status;
    private LocalDateTime ostatecznyTerminOplaceniaWCalosci;
    private float pozostalaKwotaDoOplacenia;
    public int MINIMALNA_ILOSC_DNI_DO_RABATU = 7;
    private LocalDateTime dataRozpoczecia;
    private LocalDateTime dataZakonczenia;
    private float calokowitaWartoscRezerwacji;
    private PracownikOddzialu pracownikOddzialu;
}
