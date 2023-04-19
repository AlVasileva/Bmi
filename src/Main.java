public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 85F;
        float height = 1.82F;
        float bmi = service.calculate(weight, height);
        System.out.println("Индекс массы вашего тела = " + bmi);

    }
}
