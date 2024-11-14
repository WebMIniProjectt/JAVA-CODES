package OOP1;
 

public class InterfaceAndAbstract   {
   public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.addititon(45,89);
        System.out.println(cal.subtraction(89,45));
        cal.msg();
    }

}
class Calculator implements Method {
 
   Calculator(){
       System.out.println("Welcome to Calculator World..");
       System.out.println("No. of methods in Method interface are "+Method.noMethod);
   }
  @Override
  public void addititon(int x, int y) {
    int c =x+y;
     System.out.println("Addition :-" +c);
  }

  @Override
  public int subtraction(int x, int y) {
     return x-y;
  }

   
  public void msg(){
    System.out.println("override Default Method");
  }
  


}
interface Method{
  public static final int noMethod=2;
  void addititon(int x,int y);
  int subtraction(int x,int y);
  default void msg(){
    System.out.println("This is Default Method");
  }
}
 

 
 