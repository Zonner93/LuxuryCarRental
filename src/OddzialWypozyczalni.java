
import lombok.Getter;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Set;

public class OddzialWypozyczalni {
    private String nazwa;
    private String adres;
    private String numerTelefonu;
    private String email;
    private LocalTime godzinaOtwarcia;
    private LocalTime godzinaZamkniecia;
    private static Set<Osoba> listaOsob;
    private static ArrayList<Auto> listaAut = new ArrayList<>();

    public OddzialWypozyczalni(String nazwa, String adres, String numerTelefonu, String email) {
        this.nazwa = nazwa;
        this.adres = adres;
        this.numerTelefonu = numerTelefonu;
        this.email = email;
    }

    public void wyswietlInformacjeOOddziale() {
        System.out.println("Nazwa jest: " + nazwa);
    }

    public void dodadjOsobe(Osoba osoba) {
        if (!listaOsob.contains(osoba)) {
            listaOsob.add(osoba);
        }
    }

    public void dodajAuto(Auto auto) {
        if(!listaAut.contains(auto)) {
            listaAut.add(auto);
        }
    }

    public ArrayList<Auto> getListaAut() {
        return listaAut;
    }

}
