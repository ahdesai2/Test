package assignments;

public class Average {
    public static double average(int sentinel_value, int[] nums) {
        int sum = 0, i = 0, count = 0;
        int[] values = nums;

        while (sentinel_value != 0) {
            count++;
            sum += values[i];
            i++;
            sentinel_value--;
        }

        if (count == 0) {
            return -1;
        } else {
            return (double) sum / count;
        }
    }
}
