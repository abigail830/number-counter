class OddCounter extends GenericCounter {

    @Override
    public boolean shouldCount(int i) {
        return i % 2 == 1;
    }

    @Override
    public int calculate(int sum, int i) {
        return sum + 1;
    }
}