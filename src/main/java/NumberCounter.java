import java.util.stream.IntStream;

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
        int sum = 0;
        if (numberType == EVEN) {
            IntStream.of(this.numbers).filter(i -> i % 2 == 0).count();

        } else if (numberType == ODD){
            IntStream.of(this.numbers).filter(i -> i % 2 == 1).count();

        } else if (numberType == POSITIVE){
            IntStream.of(this.numbers).filter(i -> i > 0).count();

        } else if (numberType == NEGATIVE){
            IntStream.of(this.numbers).filter(i -> i < 0).count();
        }

        return sum;
    }
}
