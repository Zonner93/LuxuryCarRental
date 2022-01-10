public class PracownikOddzialu extends Osoba {
    private Rezerwacja rezerwacja;

    public PracownikOddzialu(String login, String haslo, String imie, String nazwisko, String numerTelefonu, String email) {
        super(login, haslo, imie, nazwisko, numerTelefonu, email);
    }
}
