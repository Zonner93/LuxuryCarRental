import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Marka marka1 = Marka.Audi;
        String model1 = "A4";
        HashMap<String, String> daneTechniczne1 = new HashMap<String, String>();
        String maxKmNaJednymLadowaniu = "400";

        AutoElektryczne auto1 = new AutoElektryczne(marka1, model1, daneTechniczne1, maxKmNaJednymLadowaniu);

        System.out.println(auto1.getZdjecia());

    }
}
