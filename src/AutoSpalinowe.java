
import java.util.HashMap;

public class AutoSpalinowe extends Auto implements ISpalinowe{
    private String srednieSpalanie;
    private String pojemnoscBaku;
    private String pojemnoscSilnika;

    public AutoSpalinowe(long cenaZaDobe, Marka marka, String model, OddzialWypozyczalni oddzialWypozyczalni,
                         String srednieSpalanie, String pojemnoscBaku, String pojemnoscSilnika) {
        super(cenaZaDobe, marka, model, oddzialWypozyczalni);
        this.srednieSpalanie = srednieSpalanie;
        this.pojemnoscBaku = pojemnoscBaku;
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    @Override
    public void wyswietlSzczegoloweInformacje() {
        super.wyswietlSzczegoloweInformacje();
//        ...
    }

    @Override
    public void tankuj() {}
}
