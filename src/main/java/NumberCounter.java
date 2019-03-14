
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
            sum = new EvenCounter().count(numbers);

        } else if (numberType == ODD){
            sum = new OddCounter().count(numbers);

        } else if (numberType == POSITIVE){
            sum = new PositiveCounter().count(numbers);

        } else if (numberType == NEGATIVE){
            sum = new NegativeCounter().count(numbers);

        }
        return sum;
    }

    public int count(GenericCounter counter){
        return counter.count(numbers);
    }

}
