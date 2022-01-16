public class SzczegolyRezerwacji {
    private String adresPodstawieniaIOdbioru;
    private boolean czyDekoracjaSlubna = false;
    private Auto auto;
    private Rezerwacja rezerwacja;



    public SzczegolyRezerwacji(String adresPodstawieniaIOdbioru, boolean czyDekoracjaSlubna, Auto auto, Rezerwacja rezerwacja) {
        this.adresPodstawieniaIOdbioru = adresPodstawieniaIOdbioru;
        this.czyDekoracjaSlubna = czyDekoracjaSlubna;
        this.auto = auto;
        this.rezerwacja = rezerwacja;
    }

    public SzczegolyRezerwacji(String adresPodstawieniaIOdbioru, Auto auto, Rezerwacja rezerwacja) {
        this.adresPodstawieniaIOdbioru = adresPodstawieniaIOdbioru;
        this.auto = auto;
        this.rezerwacja = rezerwacja;
    }

    public SzczegolyRezerwacji(Auto auto, Rezerwacja rezerwacja, boolean czyDekoracjaSlubna) {
        this.czyDekoracjaSlubna = czyDekoracjaSlubna;
    }

    public SzczegolyRezerwacji(Auto auto, Rezerwacja rezerwacja) {
    }

    public void wprowadzAdresPodstawieniaIOdbioru(String adres) {}

    public void wyswietlFormularzZeSzczegolamiRezerwacji() {}

}
