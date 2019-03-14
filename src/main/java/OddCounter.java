public class OddCounter extends GenericCounter {

    @Override
    public boolean shouldCount(int i) {
        return i % 2 == 1;
    }
}
