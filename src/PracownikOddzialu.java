import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter
public class PracownikOddzialu extends Osoba {
    private ArrayList<Rezerwacja> przydzieloneRezerwacje;

    public PracownikOddzialu(String login, String haslo, String imie, String nazwisko, String numerTelefonu,
                             String email, ArrayList<Rezerwacja> przydzieloneRezerwacje) {

        super(login, haslo, imie, nazwisko, numerTelefonu, email);
        this.przydzieloneRezerwacje = przydzieloneRezerwacje;
    }
}
