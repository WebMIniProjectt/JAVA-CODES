package OOP1;

import java.util.ArrayList;

public class CLassAndObject {
  public static void main(String[] args) {
    // Mobile mob1 =new Mobile();
    // mob1.ram=8;
    // mob1.rom=32;
    // mob1.swichOn();
    // mob1.switchOff();
    // Mobile mob2= new Mobile();
    // System.out.println(mob2.ram);
    // Addition add1 = new Addition();
    // add1.add(45,81);
    // add1.add(45,89,45);
    // add1.mul(12,45);
    // add1.mul(45.45,78.95);
    Student s1 = new Student(12, "Aditya");
    Student s2 = new Student(45, "Apurva");
    Student s3 = new Student(23, "Om");
    Student s4 = new Student(78, "Radhika");
    Student s5 = new Student(89, "Nayra");
   
    System.out.println(s2.compare(s1));
    System.out.println(s1.toString());
    ArrayList<Student> arr = new ArrayList<>();
    arr.add(s1);
    arr.add(s2);
    arr.add(s3);
    arr.add(s4);
    arr.add(s5);
    for(Student s : arr) System.out.println(s.toString());
    for(int i=0;i<arr.size();i++){
       for(int j=0;j<arr.size()-i-1;j++){
           int x=arr.get(j).compare(arr.get(j+1));
           if(x>0){
            Student temp= arr.get(j);
            arr.set(j,arr.get(j+1));
            arr.set(j+1,temp);
           }
       }
    }
    System.out.println("*************");
    for(Student s : arr) System.out.println(s.toString());
  }
}
class Mobile{
  public int ram;
  public int rom;
  public void swichOn(){
    System.out.println("Mobile is Switch On");
  }
  public void switchOff(){
    System.out.println("Mobile Switching Off");
  }
} 
class Addition{
  Addition(){
    System.out.println("This is Adddtion Class");
  }
  public void add(int x,int y){
    int c=x+y;
    System.out.println(x+"+"+ y +"="+c);
  }
  public void add(int x,int y ,int z){
    int c=x+y+z;
    System.out.println(x+"+"+ y +"+"+z+"="+c);

  }
   void mul(int a,int b){
    int c=a*b;
    System.out.println(a+"*"+b+"="+c);
  }
   void mul(double a ,double b){
    double c=a+b;
    System.out.println(a+"*"+b+"="+c);
  }
}
class Student{
  public int rollNo ;
  public String name;
  Student(int rollNo , String name){
        this.rollNo = rollNo;
        this.name = name;
  }
  public int compare(Student stud ){
    return this.name.compareTo(stud.name);
  }
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    String str="Name : "+ name +", Roll No :"+ rollNo;
    return str;
  }
}


