import java.util.HashMap;
import java.util.*;
public class CountCommonWordsWithOneOccurrence {
    public static int countWords(String[] words1, String[] words2) {

        int count=0;

        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();

        String str = "";
        String s= "";

        for(int i=0;i<words1.length;i++){
            str = words1[i];

            if(!map1.containsKey(str)){
                map1.put(str,1);
            }
            else{
                map1.put(str,map1.get(str)+1);
            }
        }

        for(int i=0;i<words2.length;i++){
            s = words2[i];

            if(!map2.containsKey(s)){
                map2.put(s,1);
            }
            else{
                map2.put(s, map2.get(s)+1);
            }
        }

        for(Map.Entry<String, Integer> e: map1.entrySet()){
            String key = e.getKey();
            Integer val = e.getValue();

            if(map2.containsKey(key)){
                if(map2.get(key)==1 && val==1){
                    count++;
                }
            }

        }

        return count;

    }
    public static void main(String[] args) {

        String[] words1 = {"leetcode","is","amazing","as","is"};
        String[] words2 = {"amazing","leetcode","is"};

        int res = countWords(words1, words2);

        System.out.println(res);

    }
}
