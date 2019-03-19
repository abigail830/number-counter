public class NegativeStrategic implements CountStrategic {
    public boolean shouldCount(int i) {
        return i < 0;
    }
}
