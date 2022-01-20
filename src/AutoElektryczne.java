
import java.util.HashMap;

public class AutoElektryczne extends Auto implements IElektryczne{
    private String maxKmNaJednymLadowaniu;

    public AutoElektryczne(long cenaZaDobe, Marka marka, String model, OddzialWypozyczalni oddzialWypozyczalni,
                           String maxKmNaJednymLadowaniu) {
        super(cenaZaDobe, marka, model, oddzialWypozyczalni);
        this.maxKmNaJednymLadowaniu = maxKmNaJednymLadowaniu;
    }

    @Override
    public void wyswietlSzczegoloweInformacje() {
        super.wyswietlSzczegoloweInformacje();
//        ...
    }

    @Override
    public void laduj() {

    }
}
