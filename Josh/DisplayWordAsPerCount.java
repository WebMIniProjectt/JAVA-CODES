package Josh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DisplayWordAsPerCount {
   public static void main(String[] args) {
        String str="cooduueee";
        LinkedHashMap<Character,Integer> hmap=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++) hmap.put(str.charAt(i),hmap.getOrDefault(str.charAt(i),0)+1);

        System.out.println(hmap);

        HashMap<Integer,ArrayList<Character>> h=new HashMap<>();

        for(Map.Entry<Character,Integer> e :hmap.entrySet()){
             if(h.containsKey(e.getValue())){
                    h.get(e.getValue()).add(e.getKey());
             }
             else{
                 ArrayList<Character> arr=new ArrayList<>();
                 arr.add(e.getKey());
                 h.put(e.getValue(),arr);
             }
        }
     
         System.out.println(h);

        ArrayList<Integer> maxEle=new ArrayList<>();

         
        for(int i : h.keySet()){
          maxEle.add(i);
        }
        
        Collections.sort(maxEle);

        String res="";
        
        for(int i=maxEle.size()-1;i>=0;i--){
                for(Character j: h.get( maxEle.get(i))) res+=j;
        }


     System.out.println(res);
        
   }
}
