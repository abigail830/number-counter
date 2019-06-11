class EvenCounter extends GenericCounter {

    @Override
    public int calculate(int sum, int i) {
        return sum + 1;
    }

    @Override
    public boolean shouldCount(int i) {
        return i % 2 == 0;
    }
}