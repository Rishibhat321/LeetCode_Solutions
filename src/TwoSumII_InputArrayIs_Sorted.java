public class TwoSumII_InputArrayIs_Sorted {
    public static int[] twoSum(int[] numbers, int target) {

        int[] arr = new int[2];

        int len = numbers.length;
        int i=0;
        int j=len-1;

        while(i<j){
            if(numbers[i] + numbers[j] == target){
                arr[0] = i+1;
                arr[1] = j+1;
                break;
            }
            else if(numbers[i] + numbers[j] > target){
                j--;
            }
            else{
                i++;
            }
        }

        return arr;
    }
    public static void main(String[] args) {

        int[] numbers = {2,7,11,15};
        int target = 9;

        int[] res = twoSum(numbers, target);

        for(int ele:res){
            System.out.print(ele + " ");
        }

    }
}
