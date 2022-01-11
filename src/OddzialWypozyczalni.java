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
    private ArrayList<Auto> listaAut;


    public OddzialWypozyczalni(String nazwa, String adres, String numerTelefonu, String email, LocalTime godzinaOtwarcia, LocalTime godzinaZamkniecia) {
        this.nazwa = nazwa;
        this.adres = adres;
        this.numerTelefonu = numerTelefonu;
        this.email = email;
        this.godzinaOtwarcia = godzinaOtwarcia;
        this.godzinaZamkniecia = godzinaZamkniecia;
    }

    public void wyswietlInformacjeOOddziale() {}
    public void dodajPracownika(PracownikOddzialu pracownikOddzialu) {}
    public void dodajAuto(Auto auto) {}
}
