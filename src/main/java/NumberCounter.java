
public class NumberCounter {
    public static final int EVEN = 1;
    public static final int ODD = 2;
    public static final int POSITIVE = 3;
    public static final int NEGATIVE = 4;

    private final int[] numbers;


    public NumberCounter(int... numbers) {
        this.numbers = numbers;
    }

    @Deprecated
    public int count(int numberType) {
        int sum = 0;
        if (numberType == EVEN) {
            for (int i : numbers) {
                if (new EventStrategic().shouldCount(i)) {
                    sum++;
                }
            }

        } else if (numberType == ODD){
            for (int i : numbers) {
                if (new OddStrategic().shouldCount(i)) {
                    sum++;
                }
            }

        } else if (numberType == POSITIVE){
            for (int i : numbers) {
                if (new PositiveStrategic().shouldCount(i)) {
                    sum++;
                }
            }

        } else if (numberType == NEGATIVE){
            for (int i : numbers) {
                if (new NegativeStrategic().shouldCount(i)) {
                    sum++;
                }
            }

        }

        return sum;
    }

    public int count(CountStrategic strategic) {
        int sum = 0;
        for (int i : numbers) {
            if (strategic.shouldCount(i)) {
                sum++;
            }
        }
        return sum;

    }

}
