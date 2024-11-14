package OOP1;

public class IneerAndNestedClasses {
     class IneerClass{
      private int x;
      IneerClass(int x){
         this.x = x;
      }
      public int getX(){
            return this.x;
      }
     }
     static class IneerClass2 {
      public static final int x=88;
      public static String getMsg(){
        System.out.println("Hello");
        return "Hello";
      }
     }
     public static void main(String[] args) {
      int a=45;
      IneerClass  obj1 = new IneerAndNestedClasses().new IneerClass(12);
      System.out.println(obj1.x);
      System.out.println(IneerClass2.x);
      IneerClass2 obj2 =new IneerClass2();
      System.out.println(obj2.getMsg());
      System.out.println(IneerClass2.getMsg());
      
     }
}
