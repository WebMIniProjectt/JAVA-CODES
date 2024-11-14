package ImportantPrograms;

public class Fibnacc{
    public static int getFibb(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return getFibb(n-1)+getFibb(n-2);
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(getFibb(n));
    }
    //01123
}