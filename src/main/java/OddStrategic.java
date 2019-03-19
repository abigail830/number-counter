public class OddStrategic implements CountStrategic {
    public boolean shouldCount(int i) {
        return i % 2 == 1;
    }
}
