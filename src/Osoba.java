
import java.util.Set;
public class Osoba {

    private String login;
    private String hashHasla;
    private String imie;
    private String nazwisko;
    private String numerTelefonu;
    private String email;
    private Klient rolaKlient;
    private OddzialWypozyczalni oddzialWypozyczalni;
    private PracownikOddzialu rolaPracownikOddzialu;
    private static Set<Osoba> listaKlientow;
    private static Set<Osoba> listaPracownikow;

    public Osoba(String login, String hashHasla, String imie, String nazwisko, OddzialWypozyczalni oddzialWypozyczalni, String numerTelefonu,
                 String email, PracownikOddzialu rolaPracownikOddzialu) {
        this.login = login;
        this.hashHasla = hashHasla;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oddzialWypozyczalni = oddzialWypozyczalni;
        this.numerTelefonu = numerTelefonu;
        this.email = email;
        this.rolaPracownikOddzialu = rolaPracownikOddzialu;
        oddzialWypozyczalni.dodadjOsobe(this);
    }

    public Osoba(String login, String hashHasla, String imie, String nazwisko, OddzialWypozyczalni oddzialWypozyczalni, String numerTelefonu,
                 String email, Klient rolaKlient) {

        this.login = login;
        this.hashHasla = hashHasla;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oddzialWypozyczalni = oddzialWypozyczalni;
        this.numerTelefonu = numerTelefonu;
        this.email = email;
        this.rolaKlient = rolaKlient;
        oddzialWypozyczalni.dodadjOsobe(this);
    }

    public Osoba(String login, String hashHasla, String imie, String nazwisko, OddzialWypozyczalni oddzialWypozyczalni, String numerTelefonu,
                 String email, Klient rolaKlient, PracownikOddzialu rolaPracownikOddzialu) {
        this.login = login;
        this.hashHasla = hashHasla;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oddzialWypozyczalni = oddzialWypozyczalni;
        this.numerTelefonu = numerTelefonu;
        this.email = email;
        this.rolaKlient = rolaKlient;
        this.rolaPracownikOddzialu = rolaPracownikOddzialu;
        oddzialWypozyczalni.dodadjOsobe(this);
    }


    public void utworzOsobe(OddzialWypozyczalni oddzialWypozyczalni) throws Exception {
        if (oddzialWypozyczalni==null) {
            throw new Exception("Oddział Wypożyczalni nie istnieje!");
        }
        oddzialWypozyczalni.dodadjOsobe(this);
    }

    public void setRolaKlient(Klient rolaKlient) {
        this.rolaKlient = rolaKlient;
    }

    public void setRolaPracownikOddzialu(PracownikOddzialu rolaPracownikOddzialu) {
        this.rolaPracownikOddzialu = rolaPracownikOddzialu;
    }
}