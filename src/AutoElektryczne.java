import java.util.HashMap;

public class AutoElektryczne extends Auto{
    private String maxKmNaJednymLadowaniu;

    public AutoElektryczne(Marka marka, String model, HashMap<String, String> daneTeczniczne) {
        super(marka, model, daneTeczniczne);
    }

    @Override
    public void wyswietlSzczegoloweInformacje() {
        super.wyswietlSzczegoloweInformacje();
//        ...
    }
}
