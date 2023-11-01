import java.util.*;
public class qsss8 {
    public static int raisedpower(int x,int n){
        int power=Math.pow(x,n);
        System.out.println(power);
        return power;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        raisedpower(x, n);
    }
    
}
