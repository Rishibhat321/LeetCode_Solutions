import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

public class duplicates_in_array {
    public static List<Integer> findDuplicates(int[] nums) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }

        for(Map.Entry<Integer, Integer> e : map.entrySet())
        {
            Integer key = e.getKey();
            Integer val = e.getValue();

            if(val==2){
                list.add(key);
            }
        }

        return list;
    }
    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> res = (ArrayList<Integer>) findDuplicates(arr);

        System.out.println(res);

    }
}
