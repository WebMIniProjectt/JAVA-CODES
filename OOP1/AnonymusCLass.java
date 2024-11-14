package OOP1;

public class AnonymusCLass {
  
  public static void main(String[] args) {
    Vechicle v1 = new Vechicle(){
      public String color ;
     
      public void FillColor(){
       System.out.println("Car color is "+color);
      }
   };
   
     
  
   
    
  }
}

class Vechilce{
  public  int wheelCount;
  public void start(){
    System.out.println("Vechilcle is Starting");
  }

}
