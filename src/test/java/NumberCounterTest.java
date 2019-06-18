import org.junit.jupiter.api.Test;

import java.util.function.IntPredicate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberCounterTest {

    IntPredicate evenPredicate = i -> i % 2 == 0;
    IntPredicate oddPredicate = i -> i % 2 == 1;
    IntPredicate positivePredicate = i -> i > 0;
    IntPredicate negativePredicate = i -> i < 0;

    @Test
    void test_should_able_to_count_even() {

        final NumberCounter input = new NumberCounter(1, 2, 3, 4, 5);

        final int result = input.count(evenPredicate);

        assertEquals(2, result);
    }

    @Test
    void test_should_able_to_count_odd() {

        final NumberCounter input = new NumberCounter(1, 2, 3, 4, 5);

        final int result = input.count(oddPredicate);

        assertEquals(3, result);
    }

    @Test
    void test_should_able_to_count_positive() {

        final NumberCounter input = new NumberCounter(-1, 2, 3, 4, 5);

        final int result = input.count(positivePredicate);

        assertEquals(4, result);
    }

    @Test
    void test_should_able_to_count_negative() {

        final NumberCounter input = new NumberCounter(-1, 2, 3, 4, 5);

        final int result = input.count(negativePredicate);

        assertEquals(1, result);
    }
}