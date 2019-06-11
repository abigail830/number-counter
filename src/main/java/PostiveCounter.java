class PostiveCounter extends GenericCounter {

    @Override
    public boolean shouldCount(int i) {
        return i > 0;
    }

    @Override
    public int calculate(int sum, int i) {
        sum += i;
        return sum;
    }
}