
public class NumberCounter {
    public static final int EVEN = 1;
    public static final int ODD = 2;
    public static final int POSITIVE = 3;
    public static final int NEGATIVE = 4;

    private final int[] numbers;


    public NumberCounter(int... numbers) {
        this.numbers = numbers;
    }

    public int count(int numberType) {

        if (numberType == EVEN) {
            int sum = 0;
            for (int i : numbers) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            return sum;

        } else if (numberType == ODD) {
            int sum = 0;
            for (int i : numbers) {
                if (i % 2 == 1) {
                    sum += i;
                }
            }
            return sum;

        } else if (numberType == POSITIVE) {
            int sum = 1;
            for (int i : numbers) {
                if (i > 0) {
                    sum *= i;
                }
            }
            return sum;

        } else if (numberType == NEGATIVE) {
            int sum = 1;
            for (int i : numbers) {
                if (i < 0) {
                    sum *= Math.abs(i);
                }
            }
            return sum;
        }

        return 0;

    }
}
