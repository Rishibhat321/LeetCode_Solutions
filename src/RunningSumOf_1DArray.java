public class RunningSumOf_1DArray {
    public static int[] runningSum(int[] nums) {

        int len = nums.length;

        int[] arr = new int[len];

        for(int i=1;i<len;i++)
        {
            nums[i] = nums[i] + nums[i-1];
        }

        for(int i=0;i<len;i++)
        {
            arr[i] = nums[i];
        }

        return arr;
    }
    public static void main(String[] args) {

        int[] nums = {3,1,2,10,1};
        int[] res = runningSum(nums);

        System.out.println("The running sum  of the array is:");

        for(int i : res){
            System.out.print(i + " ");
        }

    }
}
