import java.util.HashMap;

public class AutoElektryczne extends Auto{
    private String maxKmNaJednymLadowaniu;

    public AutoElektryczne(Marka marka, String model, HashMap<String, String> daneTeczniczne,
                           String maxKmNaJednymLadowaniu) {
        super(marka, model, daneTeczniczne);
        this.maxKmNaJednymLadowaniu = maxKmNaJednymLadowaniu;
    }

    @Override
    public void wyswietlSzczegoloweInformacje() {
        super.wyswietlSzczegoloweInformacje();
//        ...
    }
}
