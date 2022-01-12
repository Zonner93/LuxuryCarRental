import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter @Setter
public abstract class Osoba {
    private final Integer id;
    private String login;
    private String hashHasla;
    private String imie;
    private String nazwisko;
    private String numerTelefonu;
    private String email;
    private HashMap<Integer, OddzialWypozyczalni> listaOddzialow;

    public Osoba(Integer id, String login, String hashHasla, String imie, String nazwisko, String numerTelefonu, String email) {
        this.id = id;
        this.login = login;
        this.hashHasla = hashHasla;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerTelefonu = numerTelefonu;
        this.email = email;
    }
}
