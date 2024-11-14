package ImportantPrograms;
import java.util.*;
public class ArrayDequeFunctions {
  public static void main(String[] args) {
    ArrayDeque<Integer> arr= new ArrayDeque<>();
    arr.offer(45); //add last

    arr.offerLast(45); //last add
    arr.offerFirst(45);//first add
    arr.add(86);
    arr.addLast(78);
    arr.addFirst(56);

    arr.poll();
    arr.pollFirst();
    arr.pollLast();
    arr.remove();
    arr.removeFirst();
    arr.removeLast();

    System.out.println(arr.size());

  
    

    


  }
}
