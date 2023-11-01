import java.util.*;
public class qss4 {
    public static double findcirumference(int r){
        int a=r*r;
        double circumference=3.14*a;
        System.out.println(circumference);
        return circumference;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        findcirumference(r);
    }
    
}
