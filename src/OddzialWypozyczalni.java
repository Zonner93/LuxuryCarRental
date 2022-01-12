import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

@Getter @Setter
public class OddzialWypozyczalni {
    private final Integer id;
    private String nazwa;
    private String adres;
    private String numerTelefonu;
    private String email;
    private LocalTime godzinaOtwarcia;
    private LocalTime godzinaZamkniecia;
    private HashMap<Integer, PracownikOddzialu> listaPracownikow;
    private HashMap<Integer, Auto> listaAut;


    public OddzialWypozyczalni(Integer id, String nazwa, String adres, String numerTelefonu, String email,
                               LocalTime godzinaOtwarcia, LocalTime godzinaZamkniecia) {
        this.id = id;
        this.nazwa = nazwa;
        this.adres = adres;
        this.numerTelefonu = numerTelefonu;
        this.email = email;
        this.godzinaOtwarcia = godzinaOtwarcia;
        this.godzinaZamkniecia = godzinaZamkniecia;
    }

    public void wyswietlInformacjeOOddziale() {}

    public void dodajPracownika(PracownikOddzialu pracownikOddzialu) {
        listaPracownikow.put(pracownikOddzialu.getId(), pracownikOddzialu);
    }

    public void dodajAuto(Auto auto) {
        listaAut.put(auto.getId(), auto);
    }
}
