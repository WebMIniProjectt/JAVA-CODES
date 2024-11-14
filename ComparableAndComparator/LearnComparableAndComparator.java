package ComparableAndComparator;

import java.util.*;
class MyCustomDogComparator implements Comparator<Animal>{

  @Override
  public int compare(Animal o1, Animal o2) {
     return o2.weight-o1.weight;
  }
  
}
///Comparator is Functional interface consist single  abstract method

public class LearnComparableAndComparator {
 public static void main(String[] args) {
      Animal a1=new Animal(4,"Leo",10);
      Animal a2=new Animal(6,"Bruno",15);
      Animal a3=new Animal(2,"Maxo",4);
      Animal a4=new Animal(6,"Aon",8);


      List<Animal> dogs=new ArrayList<>();
      
      dogs.add(a1);
      dogs.add(a2);
      dogs.add(a3);
      dogs.add(a4);
      
      
      Collections.sort(dogs);//comparable interface used;Sort on thebasis of age then name;

      Collections.sort(dogs , new MyCustomDogComparator());//use comparator sort the basis of the weight;
      

      //second way
      Collections.sort(dogs , new Comparator<Animal>() {

        @Override
        public int compare(Animal o1, Animal o2) {
          return o1.name.compareTo(o2.name);
        }
        
      }); //use comparator sort the basis of the name;



      //third way
      Collections.sort(dogs ,(o1,o2) -> o1.name.compareTo(o2.name)); //lambda expression always do this


      //fourth way  -Comparators comparing mehod
      Collections.sort(dogs, Comparator.comparing(Animal::getAge).thenComparing(Animal::getName));

      System.out.println(dogs);
      System.out.println(dogs);



      int arr[][]={{1,5,8},
                 {2,6,3},
                 {0,6,9}};
      Arrays.sort(arr,(arr1,arr2)->arr1[0]-arr2[0]);

      for(int[] a :arr){
        for(int j : a) System.out.print(j+" ");
        System.out.println();
      }
       
      

 }
  

 
}
