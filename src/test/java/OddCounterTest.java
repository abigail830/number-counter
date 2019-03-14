import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddCounterTest {

    @Test
    void should_get_6_odd_count_when_input_1_to_11() {
        OddCounter numberCounter = new OddCounter();
        assertEquals(6, numberCounter.count(1,2,3,4,5,6,7,8,9,10,11));
    }

}