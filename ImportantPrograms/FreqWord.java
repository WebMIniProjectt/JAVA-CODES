package ImportantPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FreqWord {
    public static void main(String[] args) {
        String str="radhe radhe and govinda  govinda";
        String arr[]= str.split(" ");
        for(String s:arr) System.out.println(s);
        HashMap<String,Integer> map =new HashMap<>();
        for(String s:arr) map.put(s,map.getOrDefault(s,0)+1);
        System.out.println(map);
        ArrayList<ArrayList<String>> arr1 =new ArrayList<>();
        for(Map.Entry<String ,Integer> e : map.entrySet() ){
          ArrayList<String> ele =new ArrayList<>();
          ele.add(e.getKey());
          ele.add(String.valueOf(e.getValue()));
          arr1.add(ele);
        }
        System.out.println(arr1);

    }
}
