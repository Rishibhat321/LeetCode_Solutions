public class ConsecutiveCharacters {
    public static int maxPower(String s) {

        int res = 1;
        int count=1;


        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1)){
                count += 1;
            }
            else{
                count=1;
            }
            res = Math.max(res,count);
        }

        return res;

    }
    public static void main(String[] args) {

        String s = new String("abbcccddddeeeeedcba");
        int res = maxPower(s);

        System.out.println(res);

    }
}
