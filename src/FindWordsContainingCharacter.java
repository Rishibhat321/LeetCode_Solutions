import java.util.*;
import java.util.ArrayList;

public class FindWordsContainingCharacter {
    public static List<Integer> findWordsContaining(String[] words, char x) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0;i<words.length;i++)
        {
            String str = words[i];
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(j)==x){
                    list.add(i);
                    break;
                }
            }
        }

        return list;
    }
    public static void main(String[] args) {

        String[] words = {"abc","bcd","aaaa","cbc"};
        char x = 'a';

        ArrayList<Integer> res = (ArrayList<Integer>) findWordsContaining(words,x);

        System.out.println(res);

    }
}
