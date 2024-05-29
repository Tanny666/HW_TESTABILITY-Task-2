//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BmiService bmiService = new BmiService();

        int weight = 98; // вес в кг
        double height = 1.87; // рост в м

        int bmiIndex = bmiService.calculate(weight, height);

        System.out.println("BMI индекс: " + bmiIndex);
    }
}