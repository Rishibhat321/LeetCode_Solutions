public class FindMiddleIndexInArray_EquilibruimPoint {

    public static int findMiddleIndex(int[] nums) {

        if (nums.length == 1) {
            return 0;
        }

        if (nums.length == 0) {
            return -1;
        }

        int right = 0;
        int left = 0;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            right += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            right -= nums[i];

            if (left == right) {
                index = i;
                return index;
            } else {
                left += nums[i];
            }
        }

        return index;
    }
    public static void main(String[] args) {

        int[] nums = {2,3,-1,8,4};
        int res = findMiddleIndex(nums);

        System.out.println("The middle index is: " + res);

    }
}
