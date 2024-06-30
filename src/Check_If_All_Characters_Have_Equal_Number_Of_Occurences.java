import java.util.*;
import java.util.HashMap;
import java.util.HashSet;

public class Check_If_All_Characters_Have_Equal_Number_Of_Occurences {

    public static boolean areOccurrencesEqual(String s) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(!map.containsKey(ch))
            {
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }

        for(Map.Entry<Character, Integer> e: map.entrySet())
        {
            Character key = e.getKey();
            Integer val = e.getValue();

            set.add(val);
        }

        return (set.size()==1);
    }
    public static void main(String[] args) {

        String str = new String("abacbc");
        boolean res = areOccurrencesEqual(str);

        if(res){
            System.out.println("Equal Occurrences");
        }
        else{
            System.out.println("No equal Occurrences");
        }

    }
}
