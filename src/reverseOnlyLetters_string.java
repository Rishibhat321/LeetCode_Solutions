import java.util.*;
import java.util.Stack;

public class reverseOnlyLetters_string {

    public static  String reverseOnlyLetters(String s) {

        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            if(ch>='a' && ch<='z'){
                stack.push(ch);
            }
            else if(ch>='A' && ch<='Z'){
                stack.push(ch);
            }
            else{
                continue;
            }
        }

        if(stack.isEmpty()){
            return s;
        }

        char[] arr = s.toCharArray();

        for(int i=0;i<arr.length;i++){

            if(arr[i]>='a' && arr[i]<='z'){
                arr[i] = stack.pop();
            }
            else if(arr[i]>='A' && arr[i]<='Z')
            {
                arr[i] = stack.pop();
            }
        }

        String str = new String(arr);

        return str;
    }
    public static void main(String[] args) {
        String s = new String("a-bC-dEf-ghIj");
        String res = reverseOnlyLetters(s);

        System.out.println(res);
    }
}
