
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

        if (numberType == EVEN) {
            return new EvenCounter().count(numbers);

        } else if (numberType == ODD) {
            return new OddCounter().count(numbers);

        } else if (numberType == POSITIVE) {
            return new PostiveCounter().count(numbers);

        } else if (numberType == NEGATIVE) {
            return new NegativeCounter().count(numbers);
        }
        return 0;
    }

    public int count(GenericCounter counter) {
        return counter.count(numbers);
    }

}
