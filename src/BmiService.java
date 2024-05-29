public class BmiService {


    public int calculate(double weight, double height) {
        double index = weight / (height * height);
        return (int) index;
    }
}
