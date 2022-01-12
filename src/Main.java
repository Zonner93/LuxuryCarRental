import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Marka marka1 = Marka.Audi;
        String model1 = "A4";
        HashMap<String, String> daneTechniczne1 = new HashMap<>();
        String maxKmNaJednymLadowaniu = "400";

        AutoElektryczne auto1 = new AutoElektryczne(1, marka1, model1, daneTechniczne1, maxKmNaJednymLadowaniu);

//        System.out.println(auto1.getZdjecia());

        Klient klient1 = new Klient(1, "login123", "admin123", "Jan", "Kowalski",
                                "997997997", "jankowalski1@gmail.com");
        System.out.println(klient1.getId());
    }
}
