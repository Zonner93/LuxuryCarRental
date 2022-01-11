import java.util.ArrayList;

public class PracownikOddzialu extends Osoba {
    private ArrayList<Rezerwacja> przydzieloneRezerwacje;

    public PracownikOddzialu(String login, String haslo, String imie, String nazwisko, String numerTelefonu, String email) {
        super(login, haslo, imie, nazwisko, numerTelefonu, email);
    }
}
