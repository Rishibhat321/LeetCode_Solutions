import java.util.*;
import java.util.Stack;

public class reverseVowels_string {
    public static String reverseVowels(String s) {

        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' ||
                    ch=='I' || ch=='O' || ch=='U'){
                stack.push(ch);
            }
        }

        if(stack.isEmpty()){
            return s;
        }

        char[] arr = s.toCharArray();

        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' ||
                    arr[i]=='A' || arr[i]=='E'|| arr[i]=='I' || arr[i]=='O' || arr[i]=='U')
            {
                arr[i] = stack.pop();
            }
        }

        String str = new String(arr);
        return str;
    }

    public static void main(String[] args) {
        String s = new String("leetcode");

        String res = reverseVowels(s);

        System.out.println(res);
    }
}
