import java.util.HashMap;

public class AutoSpalinowe extends Auto{
    private String srednieSpalanie;
    private String pojemnoscBaku;
    private String pojemnoscSilnika;

    public AutoSpalinowe(Marka marka, String model, HashMap<String, String> daneTeczniczne) {
        super(marka, model, daneTeczniczne);
    }

    @Override
    public void wyswietlSzczegoloweInformacje() {
        super.wyswietlSzczegoloweInformacje();
//        ...
    }
}
