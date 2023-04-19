public class BmiService {
    public float calculate(float weight, float height) {
        float sqareHeight = height * height;
        float bmi = weight / sqareHeight;
        return bmi;


    }

}
