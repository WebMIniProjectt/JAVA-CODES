package ImportantPrograms;
import java.util.Scanner;
public class RootsOfQudratic {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // double a=sc.nextDouble();
    // double b=sc.nextDouble();
    // double c=sc.nextDouble();
    double a=1;
    double b=-2;
    double c=3;
    //ax^2+bx+c=0;
    //x1=(-b+Math.sqrt(b*b-4*a*c))/2
    //x2=(-b-Math.sqrt(b*b-4*a*c))/2
    double delta=Math.abs((b*b)-(4*a*c));
    System.out.println(delta);

    System.out.println(Math.sqrt(Math.abs(delta)));
    double x1 = (-b+Math.sqrt(delta))/(double)2*a;
    double x2 = (-b-Math.sqrt(delta))/(double)2*a;
    System.out.println(x1+"  "+x2);

  }
}
