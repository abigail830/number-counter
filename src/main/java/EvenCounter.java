public class EvenCounter extends GenericCounter{

    @Override
    public boolean shouldCount(int i) {
        return i % 2 == 0;
    }
}