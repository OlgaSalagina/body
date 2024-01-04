//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 65;
        double heightM = 2;
        String bodyMassIndex;

        bodyMassIndex = String.valueOf(String.valueOf(service.calculate(weightKg, heightM)));
        System.out.println(bodyMassIndex);
    }
}