public class ApplyOperationsToAnArray {
    public static int[] applyOperations(int[] nums) {

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }

        // Move zeros to end
        int res=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int temp = nums[i];
                nums[i] = nums[res];
                nums[res] =temp;

                res++;
            }
        }

        return nums;
    }
    public static void main(String[] args) {

        int[] nums = {1,2,2,1,1,0};

        int[] res = applyOperations(nums);

        System.out.println("Resulting array is: ");

        for(int ele: res){
            System.out.print(ele + " ");
        }


    }
}
