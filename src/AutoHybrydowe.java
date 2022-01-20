
public class AutoHybrydowe extends Auto implements ISpalinowe, IElektryczne {


    public AutoHybrydowe(long cenaZaDobe, Marka marka, String model, OddzialWypozyczalni oddzialWypozyczalni) {
        super(cenaZaDobe, marka, model, oddzialWypozyczalni);
    }

    @Override
    public void laduj() {

    }

    @Override
    public void tankuj() {

    }

    @Override
    public void wyswietlSzczegoloweInformacje() {
        super.wyswietlSzczegoloweInformacje();
//        ...
    }
}
