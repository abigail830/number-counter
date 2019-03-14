import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NegativeCounterTest {

    @Test
    void should_get_negative_count() {
        NegativeCounter numberCounter = new NegativeCounter();
        assertEquals(2, numberCounter.count(-1,-2,3,4,5,6,7,8,9,10,11));
    }

}