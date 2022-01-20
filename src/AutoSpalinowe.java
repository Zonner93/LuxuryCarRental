
public class AutoSpalinowe extends Auto implements ISpalinowe{

    public AutoSpalinowe(long cenaZaDobe, Marka marka, String model,
                         OddzialWypozyczalni oddzialWypozyczalni,
                         String srednieSpalanie, String pojemnoscBaku,
                         String pojemnoscSilnika) {
        super(cenaZaDobe, marka, model, oddzialWypozyczalni);
    }

    @Override
    public void wyswietlSzczegoloweInformacje() {
        super.wyswietlSzczegoloweInformacje();
//        ...
    }

    @Override
    public void tankuj() {}
}
