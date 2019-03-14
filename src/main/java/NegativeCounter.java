public class NegativeCounter extends GenericCounter{

    @Override
    public boolean shouldCount(int i) {
        return i < 0;
    }
}
