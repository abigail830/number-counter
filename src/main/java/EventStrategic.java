public class EventStrategic implements CountStrategic {
    public boolean shouldCount(int i) {
        return i % 2 == 0;
    }
}
