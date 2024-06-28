import java.util.*;
import java.util.ArrayList;

public class faultyKeyboard_string {

    public static String finalString(String s) {
        ArrayList<Character> list = new ArrayList<Character>();

        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='i'){
                Collections.reverse(list);
            }
            else{
                list.add(s.charAt(j));
            }
        }

        int len = list.size();

        char[] arr = new char[len];
        int k=0;

        for(char ele:list){
            arr[k] = ele;
            k++;
        }

        String str = new String(arr);

        return str;
    }
    public static void main(String[] args) {
        String s = new String("poiinter");
        String res = finalString(s);

        System.out.println(res);

    }
}
