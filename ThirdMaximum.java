public class ThirdMaximum {


    public int thirdMax(int[] nums) {
        int cnt = 0;
        long max = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == max || nums[i] == second || nums[i] == third) {
                continue;
            }

            if (nums[i] > max) {
                third = second;
                second = max;
                max = nums[i];
            }
            else if (nums[i] > second && nums[i] != max) {
                third = second;
                second = nums[i];
            }
            else if (nums[i] > third && nums[i] != second && nums[i] != max) {
                third = nums[i];
            }
        }

        if (third != Long.MIN_VALUE) {
            return (int) third;
        }

        return (int) max;
    }
}

    

