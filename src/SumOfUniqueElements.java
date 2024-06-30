import java.util.HashSet;
public class SumOfUniqueElements {
    public static int sumOfUnique(int[] nums) {

        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> h = new HashSet<Integer>();

        int sum=0;

        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i])){
                h.add(nums[i]);
            }
            else{
                set.add(nums[i]);
            }
        }

        for(int i=0;i<nums.length;i++)
        {
            if(!h.contains(nums[i]))
            {
                sum += nums[i];
            }
        }

        return sum;

    }
    public static void main(String[] args) {

        int[] nums = {1,2,3,2};

        int res = sumOfUnique(nums);

        System.out.println("The sum of all the unique elements in the array is : " + res);

    }
}
