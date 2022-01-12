import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;

@Getter @Setter
public class PracownikOddzialu extends Osoba {
    private HashMap<Integer, Rezerwacja> przydzieloneRezerwacje;

    public PracownikOddzialu(Integer id, String login, String hashHasla, String imie, String nazwisko, String numerTelefonu,
                             String email, ArrayList<Rezerwacja> przydzieloneRezerwacje) {

        super(id, login, hashHasla, imie, nazwisko, numerTelefonu, email);

//        naprawić
//        public void przydzielRezerwacje(Rezerwacja rezerwacja) {}
    }
}
