package OOP1;

public class InheritancePractise {
  public static void main(String[] args) {
      Building b1=new Building();
      b1.getValue(5, 50, 2500000);
      BluePrint obj1 = new Building();
      obj1.startBuilding();
  }
}

class BluePrint{
    int area;
    boolean parking;
    int noBuilding;
    BluePrint(){
      System.out.println("BluePrint Class");
    }
    void startBuilding(){
      System.out.println("Start to build");
    }
}

class Building extends BluePrint{
    Building(){
       System.out.println("Building class");
    }
   int noFloor;
   int noFlat;
   int flatPerCost;
  void print(Building obj){
        System.out.println(obj.noFloor+" "+obj.noFlat+" "+obj.flatPerCost);
  }
  void startBuilding(){
    System.out.println("Building is created");
  }

   void getValue(int noFloor,int noFlat,int flatPerCost){
      this.noFlat=noFlat;
      this.flatPerCost=flatPerCost;
      this.noFloor=noFloor;
      this.startBuilding();
      print(this);

   }
}
