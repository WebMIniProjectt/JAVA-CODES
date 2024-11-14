package OOP1;

public class LearnInhertance {
  public static void main(String[] args) {
     Vechicle v1 = new Honda();
     
      

  }
}
class Vechicle {
   public int wheelCount ;
   Vechicle(){
    System.out.println("Class name Vechicle");
   }
   public void start(){
    System.out.println("Vechicle is starting");
   }
}
class Car extends Vechicle{
  Car(){
    System.out.println("Class name Car");
  }
  
}

class Honda extends Car{
  Honda(){
    System.out.println("Class name Honda");
  }
}
