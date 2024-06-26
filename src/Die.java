import java.util.Random;

public class Die {
    private static final int SIDES = 6;
    private int faceValue;

    public void roll() {
        Random rand = new Random();
        faceValue = rand.nextInt(1, SIDES + 1); // 1-6
    }

    public int getFaceValue() {
        return faceValue;
    }
}
