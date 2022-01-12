import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter @Setter
public class AutoElektryczne extends Auto{
    private String maxKmNaJednymLadowaniu;

    public AutoElektryczne(Integer id, Marka marka, String model, HashMap<String, String> daneTeczniczne,
                           String maxKmNaJednymLadowaniu) {

        super(id, marka, model, daneTeczniczne);
        this.maxKmNaJednymLadowaniu = maxKmNaJednymLadowaniu;
    }

    @Override
    public void wyswietlSzczegoloweInformacje() {
        super.wyswietlSzczegoloweInformacje();
//        ...
    }
}
