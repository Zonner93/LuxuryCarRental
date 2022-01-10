import java.time.LocalTime;
import java.util.ArrayList;

public class OddzialWypozyczalni {
    private String nazwa;
    private String adres;
    private String numerTelefonu;
    private String email;
    private LocalTime godzinaOtwarcia;
    private LocalTime godzinaZamkniecia;
    private ArrayList<PracownikOddzialu> listaPracownikow;


    public void wyswietlInformacjeOOddziale() {}
    public void dodajPracownika(PracownikOddzialu pracownikOddzialu) {}
}
