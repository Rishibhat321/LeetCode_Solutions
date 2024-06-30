import java.util.*;
import java.util.ArrayList;

public class Find_TargetIndices_AfterSortingArray {

    public static List<Integer> targetIndices(int[] nums, int target) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                list.add(i);
            }
        }

        return list;
    }
    public static void main(String[] args) {

        int[] nums = {1,2,5,2,3};
        int target = 2;

        ArrayList<Integer> res = (ArrayList<Integer>) targetIndices(nums,target);

        System.out.println(res);

    }
}
