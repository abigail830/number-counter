public class GenericCounter {

    public int count(int... numbers) {
        int sum = 0;
        for (int i : numbers) {
            if (shouldCount(i)) {
                sum++;
            }
        }
        return sum;
    }

    public boolean shouldCount(int i) {
        return true;
    }
}
