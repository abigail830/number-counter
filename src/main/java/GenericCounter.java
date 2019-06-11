public abstract class GenericCounter {

    public int count(int... numbers) {
        int sum = 0;
        for (int i : numbers) {
            if (shouldCount(i)) {
                sum = calculate(sum, i);
            }
        }
        return sum;
    }

    public abstract int calculate(int sum, int i);

    public abstract boolean shouldCount(int i);
}
