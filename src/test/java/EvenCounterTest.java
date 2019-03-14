import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenCounterTest {

    @Test
    void should_get_5_even_count_when_input_1_to_11() {
        EvenCounter evenCounter = new EvenCounter();
        assertEquals(5, evenCounter.count(1,2,3,4,5,6,7,8,9,10,11));
    }
}