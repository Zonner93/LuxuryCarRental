import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter @Setter
public class AutoSpalinowe extends Auto{
    private String srednieSpalanie;
    private String pojemnoscBaku;
    private String pojemnoscSilnika;

    public AutoSpalinowe(Marka marka, String model, HashMap<String, String> daneTeczniczne,
                         String srednieSpalanie, String pojemnoscBaku, String pojemnoscSilnika) {
        super(marka, model, daneTeczniczne);
        this.srednieSpalanie = srednieSpalanie;
        this. pojemnoscBaku = pojemnoscBaku;
        this. pojemnoscSilnika = pojemnoscSilnika;
    }

    @Override
    public void wyswietlSzczegoloweInformacje() {
        super.wyswietlSzczegoloweInformacje();
//        ...
    }
}
