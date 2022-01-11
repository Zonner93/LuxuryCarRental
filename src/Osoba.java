import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;

@Getter @Setter
public abstract class Osoba {
    private Integer id;
    private String login;
    private String haslo;
    private String imie;
    private String nazwisko;
    private String numerTelefonu;
    private String email;
    private HashMap<Integer, OddzialWypozyczalni> listaOddzialow;

    public Osoba(Integer id, String login, String haslo, String imie, String nazwisko, String numerTelefonu, String email) {
        this.login = login;
        this.haslo = haslo;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerTelefonu = numerTelefonu;
        this.email = email;
    }
}
