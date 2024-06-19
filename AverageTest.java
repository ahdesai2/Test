package assignments;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AverageTest {

    // Test case for Path 1: sentinel_value is 0, leading to count == 0 and returning -1
    @Test
    public void testAveragePath1() {
        int sentinel_value = 0;
        int[] nums = {10, 20, 30};

        double result = Average.average(sentinel_value, nums);

        assertEquals(-1, result, "Expected result is -1 when sentinel_value is 0");
    }

    // Test case for Path 2: sentinel_value is non-zero, loop runs, count is non-zero, returns the average
    @Test
    public void testAveragePath2() {
        int sentinel_value = 3;
        int[] nums = {10, 20, 30};

        double result = Average.average(sentinel_value, nums);

        assertEquals(20.0, result, 0.0001, "Expected average is 20.0");
    }

    // Additional test case for thoroughness: sentinel_value is 1, loop runs once, returns the average
    @Test
    public void testAverageSingleLoop() {
        int sentinel_value = 1;
        int[] nums = {10, 20, 30};

        double result = Average.average(sentinel_value, nums);

        assertEquals(10.0, result, 0.0001, "Expected average is 10.0");
    }

    // Additional test case for thoroughness: sentinel_value is greater than the length of nums
    @Test
    public void testAverageExceedsLength() {
        int sentinel_value = 5;
        int[] nums = {10, 20, 30};

        double result = Average.average(sentinel_value, nums);

        // Sentinel value exceeds array length, but the loop stops after 3 iterations
        assertEquals(20.0, result, 0.0001, "Expected average is 20.0 when loop stops after array length");
    }
}
