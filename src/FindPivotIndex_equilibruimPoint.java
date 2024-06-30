public class FindPivotIndex_equilibruimPoint {

    public static int pivotIndex(int[] nums) {

        int prefix = 0;
        int suffix = 0;
        int pivot = -1;

        for(int i=0;i<nums.length;i++)
        {
            suffix += nums[i];
        }

        for(int i=0;i<nums.length;i++)
        {
            suffix -= nums[i];

            if(suffix==prefix){
                pivot = i;
                return pivot;
            }
            else{
                prefix += nums[i];
            }
        }

        return pivot;
    }
    public static void main(String[] args) {

        int[] nums= {1,7,3,6,5,6};

        int res = pivotIndex(nums);

        System.out.println("The pivot index is: " + res);

    }
}
