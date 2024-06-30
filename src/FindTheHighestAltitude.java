public class FindTheHighestAltitude {
    public static int largestAltitude(int[] gain) {

        int len = gain.length;
        int[] alt = new int[len+1];

        alt[0] = 0;
        int max = alt[0];

        for(int i=1;i<gain.length;i++)
        {
            gain[i] = gain[i] + gain[i-1];
        }

        for(int i=1;i<alt.length;i++)
        {
            alt[i] = gain[i-1];
            if(alt[i]>max){
                max = alt[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {

        int[] nums = {-5,1,5,0,-7};

        int res = largestAltitude(nums);

        System.out.println("The highest altitude is: " + res);


    }
}
