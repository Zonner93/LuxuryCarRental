public abstract class Osoba {
    private String login;
    private String haslo;
    private String imie;
    private String nazwisko;
    private String numerTelefonu;
    private String email;

    public Osoba(String login, String haslo, String imie, String nazwisko, String numerTelefonu, String email) {
        this.login = login;
        this.haslo = haslo;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerTelefonu = numerTelefonu;
        this.email = email;
    }
}
